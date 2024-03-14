package com.mode.design.adapter;

/**
 * 对象适配器模式
 * 操作适配器：适配器
 */
public class OperationAdapter implements ScoreOperation{
    //定义适配者QuickSort对象
    private QuickSort sortObj;
    //定义适配者BinarySearch对象
    private BinarySearch binarySearch;

    public OperationAdapter(){
        sortObj = new QuickSort();
        binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int array[]) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search (int array[], int key) {
        return binarySearch.binarySearch(array,key);
    }
}
