package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubCalcTest {
    SubCalc newCalc;

    @Before
    public void setUp(){
        newCalc = new SubCalc();
    }

    @Test
    public void shouldAddTwoPositiveIntegers(){
        assertEquals(8,newCalc.add(3,5));
    }
}