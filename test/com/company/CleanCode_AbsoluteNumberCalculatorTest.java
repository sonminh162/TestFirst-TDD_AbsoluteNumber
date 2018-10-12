package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CleanCode_AbsoluteNumberCalculatorTest {
    @Test
    void testFindAsoluteNumberUnder0(){
        int number = -1;
        int excepted = 1;
        int result = CleanCode_AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(excepted,result);
    }
    @Test
    void testFindAsoluteNumberEqual_0(){
        int number = 0;
        int excepted = 0;
        int result = CleanCode_AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(excepted,result);
    }
    @Test
    void testFindAsoluteNumberHigher0(){
        int number = 1;
        int excepted = 1;
        int result = CleanCode_AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(excepted,result);

    }

}