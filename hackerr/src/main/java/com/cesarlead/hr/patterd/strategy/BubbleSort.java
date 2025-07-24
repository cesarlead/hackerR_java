package com.cesarlead.hr.patterd.strategy;

public class BubbleSort implements SortStrategy {
    @Override
    public <T extends Comparable<T>> void sort(T[] arr) {
        System.out.println("Se ordeno por BubbleSort");
    }
}
