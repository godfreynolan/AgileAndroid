package com.riis.zodiac;

import android.app.Activity;
import android.os.Build;
import android.widget.ListView;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import static org.junit.Assert.*;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class ZodiacUnitTest {
    private Activity mainActivity;
    private ListView lstView;

    @Before
    public void setUp() {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull("Main Activity not setup", mainActivity);
        // what is the list view now?
        lstView = (ListView) mainActivity.findViewById(R.layout.simple_list_item_1);
    }

    @Test
    public void shouldDisplaySigns() throws Exception {
        // TO DO: Fix now we're not using array list_of_signs
        assertThat("should be a dozen star signs", 12, equalTo(lstView.getCount()));
    }

}