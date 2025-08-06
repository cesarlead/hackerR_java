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

    static int[] twoSum(int[] nums, int target) {
        Objects.requireNonNull(nums, "nums cannot be null");

        var map = new HashMap<Integer, Integer>();
        var arr = new int[2];

        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(target - nums[j])) {
                arr[0] = map.get(target - nums[j]);
                arr[1] = j;
                return arr;
            }
            map.put(nums[j], j);
        }
        return arr;
    }

    static int MaxSum(int[] arr, int k) {

        Objects.requireNonNull(arr, "arr cannot be null");

        int currentSum = 0;

        for (int j = 0; j < k; j++) {
            currentSum += arr[j];
        }

        int maxSum = currentSum;
        for (int j = k; j < arr.length; j++) {
            currentSum = currentSum - arr[j - k] + arr[j];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Two Pointers
    static boolean sumExists(int[] arr, int target) {
        Objects.requireNonNull(arr, "arr cannot be null");

        int left = 0;
        int rigth = arr.length - 1;

        while (left < rigth) {
            if (arr[left] + arr[rigth] == target) return true;
            if (arr[left] + arr[rigth] < target) left++;
            if (arr[left] + arr[rigth] > target) rigth--;
        }

        return false;
    }

    // Enunciado: Dado un arreglo de enteros numbers que ya está ordenado en orden no decreciente, encuentra dos números tales que sumen un número target específico. Devuelve los índices (basados en 1) de los dos números como un arreglo de enteros de tamaño 2.
    static int[] twoSumII(int[] arr, int target) {
        Objects.requireNonNull(arr, "arr cannot be null");

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] + arr[right] == target) return new int[]{left, right};

            if (arr[left] + arr[right] < target) left++;

            if (arr[left] + arr[right] > target) right--;

        }

        throw new IllegalArgumentException("No two sum solution");
    }

    // Enunciado: Dado un arreglo de enteros nums ordenado en orden no decreciente, devuelve un arreglo de los cuadrados de cada número, también ordenado en orden no decreciente.
    static int[] squares(int[] arr) {
        Objects.requireNonNull(arr, "arr cannot be null");

        int len = arr.length;
        int left = 0;
        int right = len - 1;

        int[] result = new int[len];

        for (int j = len - 1; j >= 0; j--) {
            System.out.println(Math.abs(arr[left]) > Math.abs(arr[right]));
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[j] = arr[left] * arr[left];
                left++;
            }
            if (Math.abs(arr[left]) < Math.abs(arr[right])) {
                result[j] = arr[right] * arr[right];
                right--;
            }
        }

        return result;
    }

    // Enunciado: Dada una cadena s, determina si es un palíndromo, considerando solo caracteres alfanuméricos y ignorando mayúsculas y minúsculas.
    static boolean isPalindrome(String s) {
        Objects.requireNonNull(s, "s cannot be null");

        // s = "A man, a plan, a canal: Panama" -> true

        String sClean = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int len = sClean.length();

        for (int j = 0; j < len / 2; j++) {
            if (sClean.charAt(j) != sClean.charAt(len - j - 1)) return false;
        }

        return true;
    }

    // Enunciado: Dado un arreglo de enteros nums, mueve todos los ceros al final del mismo manteniendo el orden relativo de los elementos no nulos. Debes hacerlo in-place, sin hacer una copia del arreglo.
    static void moveZeroes(int[] arr) {
        Objects.requireNonNull(arr, "arr cannot be null");

        int len = arr.length;

        int currentInsert = 0;

        for (int j = 0; j < len; j++) {
            if (arr[j] != 0) {
                arr[currentInsert] = arr[j];
                currentInsert++;
            }
        }

        for (int j = currentInsert; j < len; j++) {
            arr[j] = 0;
        }

    }

    // Enunciado: Dado un arreglo ordenado nums, elimina los duplicados in-place de tal manera que cada elemento único aparezca solo una vez. Devuelve la nueva longitud del arreglo.
    static int removeDuplicatesOrderedArray(int[] arr) {
        Objects.requireNonNull(arr, "arr cannot be null");

        int len = arr.length;
        int currentInsert = 0;

        for (int j = 0; j < len; j++) {
            if (arr[currentInsert] != arr[j]) {
                currentInsert++;
                arr[currentInsert] = arr[j];
            }
        }

        return currentInsert + 1;
    }


    public static void main(String[] args) {


    }
}
