package com.ds.practice.arrays;

import java.util.Arrays;

public class MinSwapsRequired {

	 static int count=0;
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		count++;
	}
	public static void main(String[] args) {
		
		//Minimum swaps required to bring all elements less than or equal to k together
		int arr[] = {2, 7, 9, 5, 8, 7, 4};
		int k=5,i=0,j=arr.length-1;
		
		for(int index=0;index<arr.length;index++) {
			
			if(j<=index)
			{
				break;
			}
			if(k<arr[index]) {
				while(k<arr[j]&&j>0) {
					j--;
				}
				swap(arr,index,j);
				j--;
			}
		}		
		//System.out.println(Arrays.toString(arr));
		//System.out.println(count);
		
		System.out.println(++i);
	}
	
	

}
