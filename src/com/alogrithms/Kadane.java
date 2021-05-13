package com.alogrithms;

public class Kadane {
	
	static void sum(int[]a,int size) {
		int max_so_far =Integer.MIN_VALUE;
		int max_ending_here=0;
		int start=0,end=0,s=0;
		
		for(int i=0;i<size;i++) {
			max_ending_here = max_ending_here+a[i];
			
			if(max_so_far<max_ending_here) {
				max_so_far = max_ending_here;
				start =s;
				end =i;
			}
			
			if(max_ending_here<0) {
				max_ending_here=0;
				s=i+1;
			}
			
		}
		System.out.println(max_so_far);
		System.out.println(start+"  "+end);
		
	}
	
	public static void main(String[] args) {
		
		int a[] = { -2, -3, -1, -2, -3 }; 
        int n = a.length; 
        sum(a, n); 
		
		
	}
	

}
