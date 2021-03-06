package com.algorithm.basics.sorting;

import java.lang.reflect.Array;

// Java program for implementation of QuickSort
public class QuickSort {

    int partition(int arr[], int low, int high) {

        System.out.print("Input is ");       printArray(arr);
        System.out.println("low :: "+low+" , high :: "+high);

        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        System.out.println("pivot :: "+pivot);
        for (int j = low; j < high; j++) {
            System.out.println("arr[j] :: "+arr[j]+" Flag is "+(arr[j] <= pivot));

            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println("Swaping "+arr[i]+" and "+ arr[j]);            }

        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        System.out.println("End Swaping "+arr[i+1]+" and "+ temp);
        System.out.println("Returning "+(i+1));



        return i + 1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        printArray(arr);
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("sorted array");
        printArray(arr);
    }
}