package com.codewars.kata;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void ReturnPosition0safe(){
        assertEquals("found the needle at position 0", Kata.findNeedle(new Object[] {"needle", "hay"}));
    }
    @Test
    public void ReturnPosition1(){
        assertEquals("found the needle at position 1", Kata.findNeedle(new Object[] {"hay", "needle"}));
    }
    @Test
    public void ReturnPosition2(){
        assertEquals("found the needle at position 2", Kata.findNeedle(new Object[] {"hay", 555, "needle"}));
    }
    @Test
    public void ReturnPosition3(){
        assertEquals("found the needle at position 3", Kata.findNeedle(new Object[] {"hay", null, 593, "needle"}));
    }
    @Test
    public void ReturnPosition4(){
        assertEquals("found the needle at position 4", Kata.findNeedle(new Object[] {"hay", 555, 593, "safe", "needle"}));
    }
    @Test
    public void ReturnPosition1_AndLengthOfArrayIs4(){
        assertEquals("found the needle at position 1", Kata.findNeedle(new Object[] {5, "needle", 555, 593}));
    }







}
