
package com.yuhao.learn.algorithm.sort;

public class QuickSort {

    public static void sort(int[] a, int low, int high) {
        if(low >= high) {
            return;
        }
        int left = low;
        int right = high;
        int key = a[left];

        while(left < right) {
            while(left < right && a[right] >= key) {
                right--;
            }
            a[left] = a[right];

            while(left < right && a[left] <= key) {
                left++;
            }
            a[right] = a[left];
        }

        a[left] = key;

        sort(a, low, left - 1);
        sort(a, left + 1, high);
    }
}
