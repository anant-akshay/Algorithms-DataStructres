package com.alogrithms;

import java.util.Comparator;

public class Node {
	public int node;
	public int cost;
	Node next;
	public Node() {
		
	}
	
	
	public static void main(String[] args) {
		Node n = new Node();
		System.out.println(n.next + " "+n.cost);
	}
	
}
