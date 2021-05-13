package com.alogrithms;

// https://github.com/mission-peace/interview/blob/master/src/com/interview/string/RabinKarpSearch.java

public class Rabinkarp {
	
	 private int prime = 101;
	
	public int patternSearch(char[]txt,char[]pat) {
		int m =pat.length;
		int n =txt.length;
		int patHash= genrateHash(pat,pat.length);
		int txtHash = genrateHash(txt,pat.length);
		for(int i =1;i<=n-m+1;i++) {
			if(patHash==txtHash && checkEqual(txt,i-1,i+m-2,pat,0,m-1)) {
				return i-1;
			}
			if(i<n-m+1) {
				txtHash = recalculateHash(txt,i-1,i+m-1,txtHash,m);
			}
		}
		return-1;
		
		
	}

	private int recalculateHash(char[] str,int oldIndex, int newIndex,int oldHash, int patternLen) {
		int newHash = oldHash - str[oldIndex];
		newHash = newHash/prime;
		newHash +=(str[newIndex]*Math.pow(prime, patternLen-1));
		return newHash;
		
	}

	private boolean checkEqual(char[] txt, int start1, int end1, char[] pat,int start2,int end2) {
		if(end1-start1 != end2-start2) {
			return false;
		}
		while(start1<=end1 && start2<=end2) {
			if(txt[start1]!=pat[start2])
				return false;
			start1++;
			start2++;
		}
		return true;
	}

	private int genrateHash(char[] txt, int length) {
		int hash =0;
		for(int i=0;i<length;i++) {
			hash +=(txt[i]*Math.pow(prime, i));
		}
		return hash;
				
	}
	
	public static void main(String[] args) {
		Rabinkarp rks =new Rabinkarp();
        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "sharRoy".toCharArray()));
        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "Roy".toCharArray()));
        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "shas".toCharArray()));
        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "usha".toCharArray()));
        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "Tus".toCharArray()));
	}
	
	
	

}
