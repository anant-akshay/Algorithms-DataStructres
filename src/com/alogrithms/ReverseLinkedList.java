package com.alogrithms;

import com.alogrithms.Solution.ListNode;

public class ReverseLinkedList {
	class ListNode {
	      int val;
	      ListNode next;
	     ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	 ListNode reverseNode(ListNode head) {
		if(  head == null || head.next == null) {
			return head;
		}
		ListNode res = reverseNode(head.next);
		head.next.next = head;
		head.next = null;
		return res;
		
	}

}
