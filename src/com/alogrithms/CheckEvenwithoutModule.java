package com.alogrithms;

public class CheckEvenwithoutModule {
	public static void main(String[] args) {
//		int n =3;
//		
//		if((n&1)==1) {
//			System.out.println("odd");
//		}else {
//			System.out.println("even");
//		}
		
	// check whethet k bit is on or off
		
//		int n =8;
//		 n = n>>2;
//		 
//		 if((n&1) == 0) {
//			 System.out.println("off");
//		 }else {
//			 System.out.println("on");
//		 }
		 
		// print subsets
		
		int [] arr = {1,2,3,4};
		
		for(int i =0;i<(1<<arr.length);i++) {
			for(int bit =0;bit<arr.length;bit++) {
				if(((i>>bit)&1) ==1) {
					System.out.print(arr[bit]+" ");
				}
			}
			System.out.println(" ");
			
		}
		
		
		
	}

}
