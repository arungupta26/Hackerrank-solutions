package com.algorithm.basics.sorting;

import sun.jvm.hotspot.debugger.posix.elf.ELFException;

public class InsertionSort {


    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr1[] = {2 ,1 ,3 ,1, 2};
        int[] finalArr = sort(arr1);

        System.out.println();
        System.out.print("Sorted Array is ");
        printArray(finalArr);
    }

    private static int[] sort(int[] array) {

        int count=0;
        for (int i = 1; i < array.length; i++) {
            int element = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > element) {

                array[j + 1] = array[j];
                j--;
                count++;
            }
            array[j + 1] = element;
            System.out.print("After iteration (" + i + ") ==> ");
            printArray(array);
            System.out.println(count);
        }


        return array;

    }
}
