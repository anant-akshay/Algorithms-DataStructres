package com.alogrithms;
import java.util.*;


public class Array_subsets {
	 List<List<Integer>> result = new ArrayList<List<Integer>>();
	 public List<List<Integer>> subsets(int[] nums) {
		 
		 if(nums.length ==0) {
			 return null;
		 }
		 help(0,nums, new ArrayList<Integer>());
		 return result;
	        
	 }
	private void help(int i, int[] nums, ArrayList<Integer> cur) {
		
		if(i >nums.length) {
       //     System.out.println("len -1_____________________________");
			return;
		}
		if(i==nums.length) {
  //          System.out.println("len -1");
   //         System.out.println(cur);
			result.add(new ArrayList<Integer>(cur));
            return;
		}
		
		help(i+1, nums, cur);
		cur.add(nums[i]);
   //     System.out.println(cur);
		help(i+1, nums, cur);
		cur.remove(cur.size()-1);
	}

}
