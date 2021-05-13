package com.datastructures;

public class DoublyLinkedList {
	Node head;
	class Node{
		int val;
		Node next;
		Node pre;
		Node(int val){
			this.val = val;
			this.next = null;
			this.pre=null;
		}
	}
	
	
	void insertAtHead(int val) {
		Node temp = new Node(val);
		if(head == null) {
			head =temp;
			return;
		}
		temp.next = head;
		head.pre = temp;
		head=temp;
	}
	
	void insertAtTail( int val) {
		if(head==null) {
			insertAtHead( val);
		}
		Node temp =new Node(val);
		Node cur = head;
		while(cur.next!=null) {
			cur =cur.next;
		}
		cur.next = temp;
		temp.pre = cur;
		
	}
	
	void delete(int pos) {
		if(head == null) {
			System.out.println("nothing to delete");
		}
		if(pos ==1) {
			head = head.next;
			head.pre = null;
			return;
		}
		Node temp = head;
		int count =1;
		while(temp!=null && count!= pos) {
			count++;
			temp =temp.next;
		}
		if(temp.next!=null) {
			temp.next.pre = temp.pre; // edge case to delete last node
		}
		temp.pre.next = temp.next;
		return;
		
	}
	
	
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp =temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		DoublyLinkedList D = new DoublyLinkedList();
		
		D.insertAtHead( 2);
		D.display();
		D.insertAtTail( 3);
		D.insertAtTail( 4);
		D.display();
		D.insertAtHead( 1);
		D.display();
		D.delete(3);
		D.display();
		D.delete(1);
		D.display();
		
	}
	
	

}
