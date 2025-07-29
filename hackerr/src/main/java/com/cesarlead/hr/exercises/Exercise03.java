package com.cesarlead.hr.exercises;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// timeConversion
public class Exercise03 {

    public String timeConversion(String timeString) {
        String[] time = timeString.split(":");
        int hour = Integer.parseInt(time[0]);
        String minute = time[1];
        String second = time[2].substring(0, 2);
        String amPm = time[2].substring(2, 4);

        if (hour == 12 && amPm.equals("AM")) {
            return "00:" + minute + ":" + second;
        } else if (hour == 12 && amPm.equals("PM")) {
            return "12:" + minute + ":" + second;
        } else if (amPm.equals("PM")) {
            return String.format("%02d", hour + 12) + ":" + minute + ":" + second;
        } else {
            return String.format("%02d", hour) + ":" + minute + ":" + second;
        }

    }

    // timeConversion

    public String timeConversion2(String timeString) {
        DateTimeFormatter inFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter outFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(timeString, inFormatter);
        return outFormatter.format(time);
    }


    public static void main(String[] args) {

        System.out.println(new Exercise03().timeConversion("07:05:45PM"));

        System.out.println(new Exercise03().timeConversion2("12:05:45PM"));
    }
}
