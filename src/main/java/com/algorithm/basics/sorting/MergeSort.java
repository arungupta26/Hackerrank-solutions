package com.algorithm.basics.sorting;

public class MergeSort {

    public static int[] merge(int[] firsHalf, int[] secondHalf) {

        System.out.print("Merging :: ");printArray(firsHalf);printArray(secondHalf);

        int firstHalfSize = firsHalf.length;
        int secondHalfSize = secondHalf.length;
        int finalDataSize = firstHalfSize + secondHalfSize;

        int[] mergedData = new int[finalDataSize];

        int firstArrayIndex = 0, secondArrayIndex = 0, finalArrayIndex = 0;

        while (firstArrayIndex < firstHalfSize && secondArrayIndex < secondHalfSize) {
            if (firsHalf[firstArrayIndex] <= secondHalf[secondArrayIndex]) {
                mergedData[finalArrayIndex++] = firsHalf[firstArrayIndex];
                firstArrayIndex++;
            } else if (firsHalf[firstArrayIndex] > secondHalf[secondArrayIndex]) {
                mergedData[finalArrayIndex++] = secondHalf[secondArrayIndex];
                secondArrayIndex++;
            }
        }

        while (firstArrayIndex < firstHalfSize) {
            mergedData[finalArrayIndex++] = firsHalf[firstArrayIndex];
            firstArrayIndex++;
        }

        while (secondArrayIndex < secondHalfSize) {
            mergedData[finalArrayIndex++] = secondHalf[secondArrayIndex];
            secondArrayIndex++;
        }


        return mergedData;
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr1[] = {3, 41, 2,3};
        int[] finalArr = sort(arr1);
        printArray(finalArr);
    }

    private static int[] sort(int[] array) {
        System.out.print("Sorting :: "); printArray(array);

        if (array.length > 1) {
            int mid = (0 + array.length) / 2;

            int[] arr1 = copy(array, 0, mid);

            int[] arr2 = copy(array, mid, array.length);

            int[] a = sort(arr1);
            int[] b = sort(arr2);
            return merge(a, b);
        } else {
            return array;
        }

    }

    private static int[] copy(int[] array, int start, int end) {

        int[] returnArray = new int[end - start];

        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = array[start++];
        }
        return returnArray;
    }
}
