package com.riis.horoscope;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertTrue;

/**
 * Created by Godfrey on 10/24/2015.
 */
public class DailyZodiacTest {

    private JsonParser tJsonParser;
    String validJson, invalidJson;

    @Before
    public void setUp() {
        validJson = "{\"horoscopes\":[{\"sign\":\"aries\",\"prediction\":\"test1\"},{\"sign\":\"taurus\",\"prediction\":\"test2\"}]}";
        invalidJson = "bogus";
        tJsonParser = new JsonParser();
    }

    @Test
    public void validJSON_true() {
        assertTrue(tJsonParser.isValidJSON(validJson));
    }

    @Test
    public void invalidJSON_false() {
        assertFalse(tJsonParser.isValidJSON(invalidJson));
    }
}

