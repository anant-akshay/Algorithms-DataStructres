package com.alogrithms;

public class Sorting {
	
	private void swap(int[] a, int i, int min) {
		int temp =a[i];
		a[i] = a[min];
		a[min] = temp;
		
	}
	
	void selectionSort(int[] a) {
		int n = a.length;
		for(int i =0;i<n-1;i++) {
			int min =i;
			for(int j =i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min =j;
				}
			}
			if(min!=i) {
				swap(a,i,min);
			}
		}
	}
	
	void quickSort(int a[],int l,int r) {
		if(l<r) {
			int pivot = partition(a,l,r);
			quickSort(a, l, pivot-1);
			quickSort(a, pivot+1, r);
		}
	}
	
	
	private int partition(int[] a, int l, int r) {
		int i =l-1;
		int pivot = a[r];
		for(int j =l;j<r;j++) {
			if(a[j]<pivot) {
				i++;
				if(i!=j) {
					swap(a, i, j);
				}	
			}
		}
		swap(a,	i+1	, r);
		
		return i+1;
	}

	void dispay(int a[]) {
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] a = {5,9,3,1,6};
		Sorting sort = new Sorting();
		sort.dispay(a);
//		sort.selectionSort(a);
//		sort.dispay(a);
		sort.quickSort(a, 0, 4);
		sort.dispay(a);
	}
	
	

}
