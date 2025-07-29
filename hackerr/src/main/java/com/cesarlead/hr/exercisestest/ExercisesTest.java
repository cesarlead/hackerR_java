package com.cesarlead.hr.exercisestest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class ExercisesTest {

    //1. Invertir una cadena de texto: Sin usar métodos de librerías (ej. StringBuilder.reverse()).
    public String reverseString(String input) {

        Objects.requireNonNull(input, "input cannot be null");

        var result = "";

        for (int i = input.length(); i > 0; i--) result += input.charAt(i - 1);

        System.out.printf("Original: %s - Invertido: %s%n", input, result);

        return result;
    }

    // 2. Verificar si una palabra es un palíndromo
    public String isPalindrome(String input) {
        Objects.requireNonNull(input, "input cannot be null");

        String inputClean = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int len = inputClean.length();

        for (int i = 0; i < len / 2; i++) {
            if (inputClean.charAt(i) != inputClean.charAt(len - i - 1)) return "Is not palindrome";
        }

        return "Is palindrome";
    }

    // Encontrar el caracter más repetido en una cadena.
    public char mostFrecuentChar(String input) {
        Objects.requireNonNull(input, "input cannot be null");

        var map = new HashMap<Character, Integer>();
        int max = 0;
        char result = ' ';

        for (int j = 0; j < input.length(); j++) {
            if (map.containsKey(input.charAt(j))) {
                map.put(input.charAt(j), map.get(input.charAt(j)) + 1);
                if (map.get(input.charAt(j)) > max) {
                    max = map.get(input.charAt(j));
                    result = input.charAt(j);
                }
            } else {
                map.put(input.charAt(j), 1);
            }
        }
        return result;
    }

    // FizzBuzz
    public String fizzBuzz(int n) {
        var result = new StringBuilder();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result.append("FizzBuzz\n");
                } else if (i % 3 == 0) {
                    result.append("Fizz\n");
                } else if (i % 5 == 0) {
                    result.append("Buzz\n");
                } else {
                    result.append(i).append("\n");
                }
            }
        }
        return result.toString();
    }

    // Two Sum
    public int[] twoSum(int[] nums, int target) {
        var result = new ArrayList<Integer>();

        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] + nums[j + 1] == target) {
                result.add(j);
                result.add(j + 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Número faltante en arreglo:** Dado un arreglo de enteros que contiene los números del 1 al *N* con uno faltante, encontrar el número que hace falta. *Evalúa:* recorrido eficiente de arreglos y uso de operaciones aritméticas (suma/resta) para detectar valores ausentes.
    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int diff = 0;
        for (int j = 0; j < n; j++) {
            diff += (j + 1) - nums[j];
        }
        return diff;
    }

    // Número duplicado en arreglo:** Dado un arreglo de enteros donde **uno** de los valores se repite, identificar el elemento duplicado.
    public static int findDuplicate(int[] nums) {
        Objects.requireNonNull(nums, "nums cannot be null");

        int len = nums.length;
        int result = 0;

        for (int j = 0; j < len; j++) {
            int index = Math.abs(nums[j]);
            if (nums[index] < 0) {
                result = index;
                break;
            }
            nums[index] = -nums[index];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3, 0, 1, 5, 6, 4, 5}));
    }
}
