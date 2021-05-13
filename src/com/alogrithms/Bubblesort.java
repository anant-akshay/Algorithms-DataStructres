package com.alogrithms;

import java.util.Arrays;

public class Bubblesort {
	
	static void  bsort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1]= a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0 ;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = {7,6,5,4};
		bsort(a);
		System.out.println(Arrays.toString(a));
		
	}
	

}
