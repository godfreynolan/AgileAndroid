package com.riis.zodiac;

import android.app.ListActivity;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class ZodiacUnitTest {
    private ListActivity mainActivity;
    private ListView listView;

    @Before
    public void setUp() {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull("Main Activity not setup", mainActivity);
        listView = mainActivity.getListView();
    }

    @Test
    public void shouldDisplaySigns() throws Exception {
        assertThat("should be a dozen star signs", 12, equalTo(listView.getCount()));
        assertEquals(Zodiac.signs[0], listView.getAdapter().getItem(0));
        assertEquals(Zodiac.signs[11], listView.getAdapter().getItem(11));
    }
}