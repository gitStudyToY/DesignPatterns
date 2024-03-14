package com.mode.design.adapter;

/**
 * 类适配器
 * 由于Java不支持多重继承，这里仅用单继承来模拟，同时也显示了类适配器的限制性
 */
public class ClassAdapter extends QuickSort implements ScoreOperation {

    @Override
    public int[] sort(int[] array) {
        return sort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return 0;
    }
}
