package com.alogrithms;

import java.util.Scanner;

public class Seive_of_eratosthenes {
	
	// calculating prime numbers
	static void seive(int n) {
		int[] primes = new int[100];
		
		for(int i =2;i<=n;i++) {
			if(primes[i]==0) {
				for(int j =2*i;j<=n;j+=i) { //or can use i*i
					primes[j]=i;
				}
			}
		}
		
		for(int i =2;i<=n;i++) {
			if(primes[i]==0) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	// calculate prime factors
	
	static void primeFactors(int n) {
		int[] primes = new int[100];
		for(int i=2;i<=n;i++) {
			primes[i] =i;
		}
		for(int j =2;j<=n;j++) {
			if(primes[j]==j) {
				for(int i =j*j;i<=n;i+=j) {
					primes[i]=j;
				}
			}
		}
		System.out.println("");
		while(n!=1) {
			System.out.print(primes[n]+" ");
			n = n/primes[n];
		}
		
		
	}
	//
	
	
//	public static void main(String[] args) {
//		int n =40;
//		seive(n);
//		primeFactors(n);
//	}
	

}
