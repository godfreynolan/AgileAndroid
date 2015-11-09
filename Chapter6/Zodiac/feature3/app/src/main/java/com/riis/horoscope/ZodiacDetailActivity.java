package com.riis.horoscope;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ZodiacDetailActivity extends Activity  {

    public static final String EXTRA_SIGN = "ZodiacSign";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_detail);

        int signNum = (Integer)getIntent().getExtras().get(EXTRA_SIGN);
        Zodiac zodiac = Zodiac.signs[signNum];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(zodiac.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(zodiac.getDescription());

        TextView symbol = (TextView)findViewById(R.id.symbol);
        symbol.setText(zodiac.getSymbol());

        TextView month = (TextView)findViewById(R.id.month);
        month.setText(zodiac.getMonth());

        // TextView daily  = (TextView)findViewById(R.id.daily);
        new AsyncTaskParseJson().execute();

}

    public class AsyncTaskParseJson extends AsyncTask<String, String, String> {

        final String TAG = "AsyncTaskParseJson.java";

        // TODO: pass as parameters
        String yourJsonStringUrl = "http://ec2-54-158-151-82.compute-1.amazonaws.com/horoscope.php";
        int yourSignNum = 0;

        // contacts JSONArray
        JSONArray dataJsonArr = null;

        @Override
        protected void onPreExecute() {}

        @Override
        protected String doInBackground(String... arg0) {

            try {
                // instantiate our json parser
                JsonParser jParser = new JsonParser();

                // get json string from url
                JSONObject json = jParser.getJSONFromUrl(yourJsonStringUrl);
                dataJsonArr = json.getJSONArray("horoscopes");

                // loop through all horoscopes
                for (int i = 0; i < dataJsonArr.length(); i++) {
                    JSONObject c = dataJsonArr.getJSONObject(i);
                    String sign = c.getString("sign");
                    String prediction = c.getString("prediction");

                    if (i == yourSignNum) {
                        this.publishProgress(prediction);
                    }
                    // show the values in our logcat
                    Log.e(TAG, "sign: " + sign
                            + ", prediction: " + prediction);
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String strFromDoInBg) {}

        @Override
        protected void onProgressUpdate(String... values) {
            //super.onProgressUpdate(values);
            TextView display = (TextView) findViewById(R.id.daily);
            display.setText(values[0]);
        }
    }




}
