package com.riis.zodiac;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class ZodiacDisplayUnitTest {
    private static final int SIGN_INDEX = 0;
    private Activity zodiacDetailActivity;

    @Before
    public void setUp() {
        Intent intent = new Intent(RuntimeEnvironment.application, ZodiacDetailActivity.class);
        intent.putExtra(ZodiacDetailActivity.EXTRA_SIGN, SIGN_INDEX);
        zodiacDetailActivity = Robolectric.buildActivity(ZodiacDetailActivity.class).withIntent(intent).create().get();
        assertNotNull("Zodiac Detail Activity not setup", zodiacDetailActivity);
    }

    @Test
    public void ariesSymbolIsRam() throws Exception {
        // TO DO: Use Robolectric to see if Aries Symbol is Ram
        TextView symbolTextView = (TextView) zodiacDetailActivity.findViewById(R.id.symbol);
        assertEquals("Ram", symbolTextView.getText().toString());
    }

    @Test
    public void ariesMonthIsApril() throws Exception {
        // TO DO: Use Robolectric to see if Aries Month is April
        TextView monthTextView = (TextView) zodiacDetailActivity.findViewById(R.id.month);
        assertEquals("April", monthTextView.getText().toString());
    }

}