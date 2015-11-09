package com.riis.zodiac;

/**
 * Created by Godfrey on 11/7/2015.
 */
public class Zodiac {
    public String[] starSigns = {"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio",
            "Sagittarius","Capricorn","Aquarius","Pisces"};

    public String getStarSign(int iStarSign){
        return starSigns[iStarSign];
    }

    public String[] getAllStarSign(){
        return starSigns;
    }
}

