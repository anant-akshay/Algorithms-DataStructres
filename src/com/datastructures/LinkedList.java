package com.datastructures;

public class LinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			
		}
	}
	
	// create and insert new node
	public static void insert(LinkedList list, int data) {
		Node new_data = new Node(data);
		System.out.println(new_data.next);
		new_data.next=null;
		if(list.head == null) {
			list.head = new_data;
		}else {
			Node last = list.head;
			while(last.next!=null) {
				last = last.next; 
			}
			last.next = new_data;
		}
	}
	//print nodes
	public static void print(LinkedList list) {
		Node curr = list.head;
		if(curr == null) {
			System.out.println("list is empty");
		}else {
			while(curr!= null) {
				System.out.println(curr.data+" ");
				curr = curr.next;
			}
		}
	}
	
	// delete nodes
	
	public static void delete(LinkedList list,int key) {
		Node curr = list.head;
		Node pre = null;
		if(curr != null && curr.data==key) {
			System.out.println("Node is at head and deleted");
			list.head = curr.next;
		}else {
			while(curr!=null && curr.data!=key) {
				pre = curr;
				curr = curr.next;
			}
			if(curr == null) {
				System.out.println("node not found");
				
			}else {
				pre.next = curr.next;
				System.out.println("deletd");
			}
		}
	}
	
	//deletion at position
	
	public static void deletAtPosition(LinkedList list, int index) {
		Node cur = list.head;
		Node pre = null;
		if(index ==0) {
			list.head = cur.next;
			System.out.println("deleted at head position");
		}else {
			while(index!=0 && cur!=null) {
				pre = cur;
				cur = cur.next;
				index--;
			}
			if(cur==null) {
				System.out.println("index not found");
				
			}else {
				pre.next = cur.next;
				System.out.println("deleted");
			}
		}
	}
	
	//insert at position
	
	public static void insertAtPosition(LinkedList list,int data, int index) {
		int i=0;
		Node pre = null;
		Node cur = list.head; 
		Node new_node = new Node(data);
		new_node.next = null;
		if(index ==0) {
			System.out.println("inserted at head");
			new_node.next= cur;
			list.head = new_node;
		}else{
			while(i!=index && cur!=null) {
				pre = cur;
				cur =cur.next;
				i++;
			}
			if(cur == null) {
				System.out.println("index not found");
			}else {
				pre.next=new_node;
				new_node.next = cur;
				System.out.println("inserted");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		insert(list, 1);
		insert(list, 2);
		insert(list, 8);
		print(list);
		insertAtPosition(list, 5,2);
		print(list);
	}
	

}
