package com.riis.zodiac;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ZodiacUnitTest
{
    private final int ARIES_ID  = 0;
    private Zodiac tZodiac;

    @Before
    public void setUp() {
        tZodiac = new Zodiac();
        //mainActivity = Robolectric.setupActivity(MainActivity.class);
        //assertNotNull("Mainactivity not instantiated", mainActivity);
        //lstView = (ListView) mainActivity.findViewById(R.id.list_of_signs);//getting the list layout xml
    }

    @Test
    public void firstStarSign_isAries() throws Exception {
        String sSign = tZodiac.getStarSign(ARIES_ID);
        assertEquals("Aries", sSign);
    }
}