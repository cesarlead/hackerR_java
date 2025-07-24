package com.cesarlead.hr.fundamentals_of_language;

import java.util.*;

public class DataStructuresDemo {

    private DataStructuresDemo() {
    }

    public static int[] createArr() {
        return new int[]{10, 20, 30};
    }

    public static List<String> createList() {
        var listS = new ArrayList<String>();
        listS.add("one");
        listS.add("two");
        listS.add("three");
        return listS;
    }

    public static Set<Double> createSet() {
        var setD = new HashSet<Double>();
        setD.add(1.00);
        setD.add(2.00);
        setD.add(3.00);
        return setD;
    }

    public static Map<String, Integer> createMap() {
        var mapSI = new HashMap<String, Integer>();
        mapSI.put("one", 1);
        mapSI.put("two", 2);
        mapSI.put("three", 3);
        return mapSI;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArr()));
        System.out.println(createList());
        System.out.println(createSet());
        System.out.println(createMap());
    }
}
