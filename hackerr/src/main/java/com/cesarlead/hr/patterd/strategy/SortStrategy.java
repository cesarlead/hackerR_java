package com.cesarlead.hr.patterd.strategy;

public interface SortStrategy {
    <T extends Comparable<T>> void sort(T[] arr);
}
