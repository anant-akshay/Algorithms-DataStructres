package com.alogrithms;

import java.util.HashSet;
import java.util.Set;

public class StringPermutationsBackTracking {
	public static void main(String[] args) {
		String s ="abc";
		permutations(s,0,s.length()-1);
	}


	private static void permutations(String s, int beg, int end) {
		
		if(beg == end) {
			System.out.println(s);
			return;
		}
		for(int i =beg;i<s.length();i++) {
			s = swap( s ,  beg ,  i);
			permutations(s, beg+1, end);
			s = swap( s ,  beg ,  i);
		}
		
	}
	
	static String swap(String s, int i ,int j ) {
		char[] sarr = s.toCharArray();
		char temp = sarr[i];
		sarr[i] = sarr[j];
		sarr[j] = temp;
		return String.valueOf(sarr);
	}
}
