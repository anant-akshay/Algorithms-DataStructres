package com.datastructures;

import java.util.Scanner;

public class BinaryTree {
	static Scanner sc =null;
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		Node root = CreateTree();
		inorderTraversal(root);
		System.out.println("");
		preorderTraversal(root);
		System.out.println("");
		postorderTraversal(root);
		
	}
	
	//Inorder Traversal
	
	static void inorderTraversal(Node root) {
		
		if(root == null) {
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
		
	}
	
	//preorder traversal
	
	static void preorderTraversal(Node root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.data+" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		
	}
	
	//post order traversal
	
	static void postorderTraversal(Node root) {
		
		if(root == null) {
			return;
		}
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.data+" ");
		
		
	}
	
	
	
	
	
	
	
	static Node CreateTree() {
		Node root = null;
		
		System.out.println("enter Value");
		int data = sc.nextInt();
		if(data==-1) {
			return null;
		}
		root = new Node(data);
		
		System.out.println("Enter Data for left of "+ data);
		root.left = CreateTree();
		
		System.out.println("Enter Data for Right "+ data);
		root.right = CreateTree();
		
		
		return root;
	}
	

}

 class Node{
	Node left,right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	
}
