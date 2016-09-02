
package com.yuhao.learn.algorithm.sort;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testSort() {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        QuickSort.sort(test1, 0, test1.length - 1);
        assertTrue(isOrdered(test1));

        int[] test2 = {12, 2, 55, 4, 5, 40, 7, 8, 9, 1};
        QuickSort.sort(test2, 0, test1.length - 1);
        print(test2);
        assertTrue(isOrdered(test2));
    }

    @Test
    public void testRandomSort() {
        Random rand = new Random();
        for(int i = 0; i < 100; i++) {
            int seed = rand.nextInt(100);
            testOneTime(seed);
        }
    }

    public void testOneTime(int seed) {
        Random rand = new Random(seed);
        int[] a = new int[20];
        for(int i = 0; i < 20; i++) {
            int s = rand.nextInt(100);
            a[i] = s;
        }
        QuickSort.sort(a, 0, 19);
        print(a);
        assertTrue(isOrdered(a));
    }

    private boolean isOrdered(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private void print(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

}
