package com.ds.practice.sorting;

import java.util.Arrays;

public class QuickSort {
	
	private static int partison(int[] arr, int start, int end) {
		int i = start - 1;
		int pivot = end;
		for (int j = start; j <= end; j++) {
			if (arr[j] <= arr[pivot]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i;
	}

	public static void quickSort(int[] arr, int start, int end) {
		if(start<end) {
			int pivot=partison(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}
	
	public static void printArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
}
