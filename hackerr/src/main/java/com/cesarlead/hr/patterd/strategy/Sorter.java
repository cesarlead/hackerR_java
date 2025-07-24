package com.cesarlead.hr.patterd.strategy;

public class Sorter {

    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public <T extends Comparable<T>> void sort(T[] arr) {
        strategy.sort(arr);
    }


}
