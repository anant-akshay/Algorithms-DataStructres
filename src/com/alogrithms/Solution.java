package com.alogrithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import com.alogrithms.Bst.TreeNode;

public class Solution {
//	class ListNode {
//		      int val;
//		      ListNode next;
//		     ListNode() {}
//		      ListNode(int val) { this.val = val; }
//		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//		 }
	
	
//	
//	  public class TreeNode {
//		      int val;
//		      TreeNode left;
//		      TreeNode right;
//		      TreeNode() {}
//		      TreeNode(int val) { this.val = val; }
//		      TreeNode(int val, TreeNode left, TreeNode right) {
//		          this.val = val;
//		          this.left = left;
//		          this.right = right;
//		      }
//		  }
//	  
	
//	public static void main(String[] args) {
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if(o1 < o2) {
//					return -1;
//				}
//				return 1;
//			}
//			
//		});
//		pq.add(1);
//		pq.add(2);
//		pq.add(3);
//		System.out.println(pq.poll());
//	}
	
	public int findComplement(int num) {
	
		String s = Integer.toBinaryString(num);
		System.out.println(s);
		int result =0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) == '0') {
				result = result +(int) Math.pow(2, i); 
			}
		}
		return result;
		
    }
        

	public static void main(String[] args) {
		int result =0;
		String s1 = "paless";
		String s2 = "pales";
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		for(char ch : s1.toCharArray()) {
			arr1[ch -'a']++;
		}
		for(char ch : s2.toCharArray()) {
			arr1[ch - 'a']--;
		}
		
		for(int i =0;i<26;i++) {
			result +=Math.abs(arr1[i]);
		}
		
		if(result<=2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
}	
	

