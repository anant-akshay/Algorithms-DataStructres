package com.alogrithms;

import java.util.Scanner;

public class GCD {
	
	public static int GcdCalc(int m , int n) {
		if(m%n==0) {
			return n;
		}
		else {
			return GcdCalc(n, m%n);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		m = sc.nextInt();
		n =sc.nextInt();
		System.out.println("the gcd is"+GcdCalc(m, n));
		sc.close();
	}

}
