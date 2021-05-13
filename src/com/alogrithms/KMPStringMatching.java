package com.alogrithms;

import java.util.Arrays;

public class KMPStringMatching {
	
	
	static void patternMatch(String txt,String pat) {
		int patLen = pat.length();
		int txtLen = txt.length();
		
		int[]lps = new int [patLen];
		int j =0;
		computeLps(pat,patLen,lps);
		//System.out.println(Arrays.toString(lps));
		for(int i =0;i<txtLen;) {
			if(pat.charAt(j)==txt.charAt(i)) {
				i++;
				j++;
			}
			if(j==patLen) {
				System.out.println("pattern found at "+(i-j));
				j =lps[j-1];
			}
			
			else if(pat.charAt(j)!=txt.charAt(i) && i<txtLen) {
				if(j==0) {
					i=i+1;
				}else {
					j = lps[j-1];
				}
			}
			
		}
		System.out.println(-1);
		
		
	}
	
	
	
	private static void computeLps(String pat, int patLen, int[] lps) {
		
		
		int len =0;
		lps[0]=0;
		int i =1;
		while(i<patLen) {
			if(pat.charAt(i)==pat.charAt(len)) {
				len++;
				lps[i]=len;
				i++;
			}
			else {
				if(len!=0) {
					len = lps[len-1];
				}else {
					lps[i]=len;
					i++;
				}
				
				
			}
			
			
		}
		
		
	}



	public static void main(String[] args) {
		String txt = "ABABDABACDABABCABAB"; 
        String pat = "AB"; 
        patternMatch(txt, pat);
	}

}
