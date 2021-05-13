package com.alogrithms;

public class Selectionsort {
	
	static void sSort(int[] data) {
		for(int i =0 ; i< data.length-1;i++) {
			int minIndex =i;
			for(int j =i+1;j<data.length;j++) {
				if(data[j]<data[minIndex]) {
					minIndex =j;
				}
			}
			int temp = data[minIndex];
			data[minIndex] = data[i];
			data[i]= temp;
		}
		for(int i=0 ;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
	public static void main(String[] args) {
		int a[] = {7,6,5,4};
		sSort(a);
		
	}

}
