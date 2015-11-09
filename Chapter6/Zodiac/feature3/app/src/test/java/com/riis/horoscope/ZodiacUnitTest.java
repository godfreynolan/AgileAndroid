package com.riis.horoscope;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ZodiacUnitTest {
    private final int ARIES_ID = 0;
    private final int NUM_SIGNS = 12;


    @Test
    public void firstStarSign_isAries() throws Exception {
        assertEquals(Zodiac.signs[ARIES_ID].getName(), "Aries");
    }

    @Test
    public void numberStarSigns_isTwelve() throws Exception {
        assertEquals(Zodiac.signs.length, NUM_SIGNS);
    }

    @Test
    public void aries_isRam() throws Exception {
        assertEquals(Zodiac.signs[ARIES_ID].getSymbol(), "Ram");
    }


}