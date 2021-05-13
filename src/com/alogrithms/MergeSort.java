package com.alogrithms;

public class MergeSort {
	
	public void merge(int[]arr,int beg,int mid,int end) {
		int n1 = mid - beg +1;
		int n2 = end - mid;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		for(int i =0;i<n1;i++) {
			arr1[i]=arr[beg+i];
		}
		for(int i=0;i<n2;i++) {
			arr2[i] = arr[mid+1+i];
		}
		int i =0,j=0,k=beg;
		
		while(i<n1&&j<n2) {
			if(arr1[i]<=arr2[j]) {
				arr[k++] = arr1[i++];
			}else {
				arr[k++]= arr2[j++];
			}
		}
		while(i<n1) {
			arr[k++] =arr1[i++]; 
		}
		while(j<n2) {
			arr[k++]=arr2[j++];
		}
		
		
	}
	
	
	public void sort(int[]arr,int beg,int end) {
		int mid = (beg+end)/2;
		
		if(beg<end) {
			sort(arr,beg,mid);
			sort(arr,mid+1,end);
			merge(arr,beg,mid,end);
		}
	}
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Array "+ arr);
		printArray(arr);
		MergeSort ob = new MergeSort();
		ob.sort(arr,0,arr.length-1);
		
		System.out.println("sorted "+ arr);
		printArray(arr);
	}

}
