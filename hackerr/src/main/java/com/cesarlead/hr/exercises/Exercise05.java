package com.cesarlead.hr.exercises;

// Lonely Integer
public class Exercise05 {

    public int lonelyInteger(int[] arr) {
        int result = 0;
        var seen = new boolean[arr.length];
        for (int j : arr) {
            if (seen[j]) {
                seen[j] = false;
            } else {
                seen[j] = true;
                result = j;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Exercise05().lonelyInteger(new int[]{1, 2, 3, 4, 3, 2, 1}));
    }
}
