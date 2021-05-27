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
	

	
	public static void main(String[] args) {
		int[] arr = {-10, -5, 0, 3, 7};
		int l =0;
		int r = arr.length-1;
		
		while(l<r){
			
			int mid =(l+r)/2;
			
			if(arr[mid] == mid) {
				System.out.println("mid "+ mid);
				break;
			}
			else if(arr[mid] > mid) {
				r = mid-1;
			}
			else {
				l =mid+1;
			}
			
		}
		
		System.out.println("not found");
	}
	
	
	
	
}	
	

