package com.pbo2.p3;

import java.util.*;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Latihan7 {
    public static void _main(String[] args) {
        Enumeration days;
        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        days = dayNames.elements();

        while (days.hasMoreElements())
            System.out.println(days.nextElement());
    }
}
