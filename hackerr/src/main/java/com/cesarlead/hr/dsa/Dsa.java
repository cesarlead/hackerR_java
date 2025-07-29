package com.cesarlead.hr.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Dsa {
    // reverseArray
    static void reverseArray(int[] arr) {
        Objects.requireNonNull(arr, "arr cannot be null");
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            int reversePosition = arr.length - j - 1;
            arr[j] = arr[reversePosition];
            arr[reversePosition] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static boolean isUnique(String[] arr) {
        Objects.requireNonNull(arr, "arr cannot be null");
        var map = new HashMap<String, Integer>();
        for (String s : arr) {
            if (map.containsKey(s)) return false;
            map.put(s, 1);
        }

        return true;
    }


    public static void main(String[] args) {
        reverseArray(new int[]{1, 2, 3, 4, 5}); // [5, 4, 3, 2, 1]
        System.out.println(isUnique(new String[]{"a", "b", "c", "d"})); // true
        System.out.println(isUnique(new String[]{"a", "b", "c", "d", "a"})); // false
    }
}
