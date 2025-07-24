package com.cesarlead.hr.patterd.strategy;

public class Test {

    public static void main(String[] args) {
        Sorter sorter = new Sorter(new QuickSort());
        sorter.sort(new Integer[]{1, 2, 3, 4, 5});

        sorter = new Sorter(new BubbleSort());
        sorter.sort(new Integer[]{1, 2, 3, 4, 5});
    }
}
