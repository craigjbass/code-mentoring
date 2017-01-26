package com.codewars.kata;

import java.util.Arrays;

public class Kata {
    public static String findNeedle(Object[] objects) {
        int needle = Arrays.asList(objects).indexOf("needle");
        return "you found the needle at position " + needle;
    }
}
