package com.example.tpo;

import com.example.tpo.task1.TangentDecompose;
import com.example.tpo.task2.CountingSort;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        int[] arr = {0, -5 ,-16, 25, 33, 22, 11};
        int[] sorted = CountingSort.sort(arr);
        for(int value : sorted){
            System.out.println(value);
        }
        System.out.println(Math.PI / 2);
        double x = 1.2;
        int esp = 7;
        double answ = TangentDecompose.tan_decompose(x, esp);
        System.out.println(answ);

    }
}
