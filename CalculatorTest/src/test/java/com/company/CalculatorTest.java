package com.company;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class CalculatorTest {

//    declared object for scope in entire test
    Calculator calc;


    //    @Before with method setUp will run first
    @Before
    public void setUp(){
        calc = new Calculator();
    }


    @Test
    public void shouldSumTwoArrays(){

        int[] testArrayOne = {1,2};
        int[] testArrayTwo = {3,4};

        assertEquals(10,calc.sumArray(testArrayOne,testArrayTwo));
        assertNotEquals(11,calc.sumArray(testArrayOne,testArrayTwo));

    }

    @Test
    public void shouldArrayTwoIntegers(){
        int[] testArray = {5,6,7};
        int[] testArrayTwo = {7,5,3};

        assertArrayEquals(testArray,calc.arrayify(3,5));
        assertNotEquals(testArrayTwo,calc.arrayify(3,5));

    }

}