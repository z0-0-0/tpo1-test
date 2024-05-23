package com.example.tpo.task2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;



public class CountingSortTest {

    @Test
    public void checkSorting() {
                assertArrayEquals(new int[]{3, 4, 5, 33}, CountingSort.sort(new int[]{33, 3, 4, 5}));
                assertArrayEquals(new int[]{1,3,4,7,9}, CountingSort.sort(new int[]{4,1,3,9,7}));
                assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, CountingSort.sort(new int[]{10,9,8,7,6,5,4,3,2,1}));
                assertArrayEquals(new int[]{22, 28, 30, 82, 159, 166, 166, 287, 289, 338, 365, 371, 444, 451, 520, 527, 567, 623, 676, 714, 719, 741, 771, 783, 818, 874, 884, 914, 960, 970, 983},
                        CountingSort.sort(new int[]{444, 520, 166, 874, 676, 22, 338, 783, 365, 970, 623, 30, 287, 451, 914, 371, 741, 818, 527, 714, 166, 159, 960, 289, 567, 82, 771, 983, 719, 884, 28}));
    }

    @Test
    public void checkEmpty() {
        assertArrayEquals(new int[]{}, CountingSort.sort(new int[]{}));
    }

    @Test
    public void checkNegativeValues() {
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, CountingSort.sort(new int[]{-5, -1, -4, -3, -2}));
    }

    @Test
    public void checkZeros() {
        assertArrayEquals(new int[]{0,0,0,0,0}, CountingSort.sort(new int[]{0,0,0,0,0}));
    }

    @Test
    public void checkNull() {
        assertNull(CountingSort.sort(null));
    }
}
