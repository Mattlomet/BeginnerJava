package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TVTest {

    TV tele;

    @Before
    public void setUp(){
        tele = new TV(15);
    }

    @Test
    public void shouldTurnOn(){
        tele.On();
        assertTrue(tele.isOn);
//        assertArrayEquals(testArray,tele.On());
    }

}