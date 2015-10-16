package com.riis.calculatordiv;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void calculator_CorrectAdd_ReturnsTrue() {
        assertEquals(mCalculator.add(3, 4),7,0);
        assertEquals(mCalculator.add(4, 3),7,0);
        assertEquals(mCalculator.add(8, 2),10,0);
        assertEquals(mCalculator.add(-1, 4),3,0);
        assertEquals(mCalculator.add(3256, 4),3260,0);
    }

    @Test
    public void calculator_CorrectSub_ReturnsTrue() {
        assertEquals(mCalculator.sub(4, 3),1,0);
    }

    @Test
    public void calculator_CorrectSubHamCrest_ReturnsTrue() {
        assertEquals(mCalculator.sub(4, 3),1,0);
    }

    @Test
    public void calculator_CorrectMul_ReturnsTrue() {
        assertEquals(mCalculator.mul(3, 4),12,0);
    }

    @Test
    public void calculator_CorrectDiv_ReturnsTrue() {
        assertEquals(mCalculator.div(12, 4),3,0);
    }

    @After
    public void tearDown() {
        mCalculator = null;
    }
}