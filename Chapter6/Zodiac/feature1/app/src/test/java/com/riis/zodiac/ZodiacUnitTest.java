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

/**
 * Created by Godfrey on 11/7/2015.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class ZodiacUnitTest {
    private Activity mainActivity;
    private ListView lstView;

    @Before
    public void setUp() {
        mainActivity= Robolectric.setupActivity(MainActivity.class);
        assertNotNull("Main Activity not setup", mainActivity);
        lstView=(ListView)mainActivity.findViewById(R.id.list_of_signs);
    }

    @Test
    public void shouldDisplaySigns() throws Exception {
        assertThat("should be a dozen star signs", 12, equalTo(lstView.getCount()));
    }
}
