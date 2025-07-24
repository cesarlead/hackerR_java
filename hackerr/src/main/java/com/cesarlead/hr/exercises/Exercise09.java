package com.cesarlead.hr.exercises;

// Pangrams
public class Exercise09 {

    public String paragrams(String s) {
        var str = s.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        var seen = new boolean[26];
        for (char c : str) {
            seen[c - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) return "not pangram";
        }

        return "pangram";
    }
}
