package com.riis.zodiac;

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

/**
 * Created by Godfrey on 11/7/2015.
 *
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 *
 * If the Robolectric test will not run, edit the test configuration by adding /$MODULE_NAME to the
 * end of the Working Directory path.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = "src/main/AndroidManifest.xml")
public class ZodiacUnitTest {
    private ListView lstView;

    @Before
    public void setUp() {
        MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertNotNull("Main Activity not setup", mainActivity);
        lstView=(ListView) mainActivity.findViewById(R.id.list_of_signs);
    }

    @Test
    public void shouldDisplaySigns() throws Exception {
        assertThat("should be a dozen star signs", 12, equalTo(lstView.getCount()));
        // TODO: add test to find Aries and Pisces
        assertEquals("Aries", lstView.getAdapter().getItem(0));
        assertEquals("Pisces", lstView.getAdapter().getItem(11));
    }
}
