package com.alogrithms;
import java.util.*;
public class TwoPointer {
	
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	Set<List<Integer>> set = new HashSet<List<Integer>>();
	 public List<List<Integer>> threeSum(int[] nums) {
		 
		 Arrays.sort(nums);
		 for(int i =0;i<nums.length-2;i++) {
			 findZero(nums,-nums[i] ,i+1);
		 }
	  
		 return result;
	 }

	private void findZero(int[] nums, int x, int l) {
		int r = nums.length-1;
		while(l<r) {
			if(nums[l] + nums[r] == x) {
				List<Integer> cur = new ArrayList<Integer>();
				cur.add(nums[l]);
				cur.add(nums[r]);
				cur.add(-x);
				if(!set.contains(cur)) {
					result.add(cur);
					set.add(cur);
				}
				return;
			}
			else if(nums[l]+nums[r]<x) {
				l++;
			}else {
				r--;
			}
		}
	}

}
