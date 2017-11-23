package com.vlad.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    CalcAPI api = null;

    @org.junit.Before
    public void setUp() throws Exception {
        api = new CalcAPI();
    }
    @Test
    public void sum() {
        double res = api.Calc(2,7,"+");
        assertEquals(9.0,res,0.2);
    }
    @Test
    public void div() {
        double res = api.Calc(14,7,"/");
        assertEquals(2.0,res,0.2);
    }

    @Test
    public void mul() {
        double res = api.Calc(2,-8,"*");
        assertEquals(-16.0,res,0.2);
    }

    @Test
    public void sub() {
        double res = api.Calc(2,7,"-");
        assertEquals(-5.0,res,0.2);
    }


    @org.junit.After
    public void tearDown() throws Exception {
        api = null;
    }

}