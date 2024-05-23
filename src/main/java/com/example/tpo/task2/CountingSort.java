package com.example.tpo.task2;

public class CountingSort {
    private static int min(int[] arr) {
        int k = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < k) {
                k = arr[i];
            }
        }
        return k;
    }

    private static int max(int[] arr) {
        int k = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > k) {
                k = arr[i];
            }
        }
        return k;
    }

    private static boolean is_empty(int[] arr) {
        if (arr == null){
            return true;
        }
        if (arr.length == 0) {
            return true;
        }
        return false;
    }

    public static int[] sort(int[] arr) {
        if (is_empty(arr)) {
            return arr;
        }

        if (arr.length == 1) {
            return arr;
        }

        int arr_min = min(arr);
        int arr_max = max(arr);
        boolean is_negative = false;
        int[] temp_count = new int[0];
        if (arr_min < 0) {
            is_negative = true;
        }

        int abs_min = Math.abs(arr_min);

        if(is_negative){
        temp_count = new int[arr_max + abs_min + 1];
        } else {
        temp_count = new int[arr_max - abs_min + 1];
        }
        int[] sorted_arr = new int[arr.length];

        if (is_negative) {
            for (int value : arr) {
                ++temp_count[value + abs_min];
            }
        } else {
            for (int value : arr) {
                ++temp_count[value - abs_min];
            }
        }

        for (int j = 1; j < temp_count.length; j++) {
            temp_count[j] = temp_count[j] + temp_count[j - 1];
        }

        if (is_negative) {
            for (int i = arr.length - 1; i >= 0; i--) {
                temp_count[arr[i] + abs_min] = temp_count[arr[i] + abs_min] - 1;
                sorted_arr[temp_count[arr[i] + abs_min]] = arr[i];
            }
        } else if (!is_negative){
            for (int i = arr.length - 1; i >= 0; i--) {
                temp_count[arr[i] - abs_min] = temp_count[arr[i] - abs_min] - 1;
                sorted_arr[temp_count[arr[i] - abs_min]] = arr[i];
            }
        }
        return sorted_arr;
    }
}
