package com.riis.zodiac;

import android.app.Activity;
import android.app.ListActivity;
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
    private ListActivity mainActivity;
    private ListView lstView;

    @Before
    public void setUp() {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull("Main Activity not setup", mainActivity);
        lstView = mainActivity.getListView();
    }

    @Test
    public void shouldDisplaySigns() throws Exception {
        assertThat("should be a dozen star signs", 12, equalTo(lstView.getCount()));
        assertEquals("Aries", lstView.getAdapter().getItem(0));
        assertEquals("Pisces", lstView.getAdapter().getItem(11));
    }

}