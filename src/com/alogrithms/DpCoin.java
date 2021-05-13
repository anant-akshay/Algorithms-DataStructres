package com.alogrithms;

import java.util.Arrays;

public class DpCoin {
	
	static int coinChange(int n, int[] a ,int[]dp) {
		if(n==0) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		
		for(int i =0;i<a.length;i++) {
			
			if(n-a[i]>=0) {
				int subans =0;
				if(dp[n-a[i]]!=-1) {
					subans = dp[n-a[i]];
				}else {
				
					subans = coinChange(n-a[i], a,dp);
				}
				if(subans!=Integer.MAX_VALUE && (subans+1) < ans) {
					ans = subans+1;
				}
			}
			
			
			
		}
		return dp[n]=ans;
		
	}
	
	public static void main(String[] args) {
		int n =18;
		int[] a = {7,5,2};
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0]=0;
		System.out.println(coinChange(n, a,dp));
	}
	

}
