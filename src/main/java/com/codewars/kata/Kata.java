package com.codewars.kata;


public class Kata {
    public static String findNeedle(Object[] objects) {


        int i = -1;
        while (i < objects.length) {
            i++;
            if (objects[i] == null) continue;
            if (objects[i].equals("needle")) return "found the needle at position " + i;
        }


        return null;
    }
}
