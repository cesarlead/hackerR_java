package com.cesarlead.hr.exercises;

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


    public static void main(String[] args) {

        System.out.println(new Exercise03().timeConversion("07:05:45PM"));

    }
}
