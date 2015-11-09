package com.riis.zodiac;

import android.app.Activity;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class ZodiacDisplayUnitTest {
    private Activity zodiacDetailActivity;

    @Before
    public void setUp() {
        // TO DO - Setup ZodiacDetailActivity with EXTRA_SIGN = 1
        zodiacDetailActivity = Robolectric.setupActivity(ZodiacDetailActivity.class);
        assertNotNull("Zodiac Detail Activity not setup", zodiacDetailActivity);
    }

    @Test
    public void ariesSymbolIsRam() throws Exception {
        // TO DO: Use Robolectric to see if Aries Symbol is Ram
    }

    @Test
    public void ariesMonthIsApril() throws Exception {
        // TO DO: Use Robolectric to see if Aries Month is April
    }

}