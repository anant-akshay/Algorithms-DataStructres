package com.datastructures;

import java.util.HashMap;



public class Tire {
	
	static class Node{
		Character data;
		boolean terminal;
		HashMap<Character, Node> children;
		Node(char ch){
			this.children = new HashMap<Character, Node>();
			this.data = ch;
			this.terminal =false;
		}
	}
	
	static class TrieNode{
		public Node root;
		TrieNode(){
			this.root = new Node('0');  
		}
		 
		 
		 void insert(String str) {
			 Node temp =root;
			 for(char ch : str.toCharArray()) {
				 //temp = temp.children.computeIfAbsent(ch, c -> new Node(ch));
				 if(temp.children.containsKey(ch)) {
					 temp = temp.children.get(ch);
				 }else {
					 Node n = new Node(ch);
					 temp.children.put(ch, n);
					 temp = temp.children.get(ch);
				 }
			 }
			 
			 temp.terminal =true;
		 }
		 
		 void dfs(Node temp,String str, String output) {
			 if(temp == null)
				 return;
			 if(temp.terminal)
				 System.out.println(str+output);
			 for(Node cur : temp.children.values()) {
				 dfs(cur, str, output+cur.data);
			 }
		 }
		 
		 void delete(String str) {
			 Node temp = root;
			 
			 if(!temp.children.containsKey(str.charAt(0))) {
				 System.out.println("doen not exist");
			 }
			 
			 for(char ch : str.toCharArray()) {
				 if(temp.children.containsKey(ch)) {
					 temp =temp.children.get(ch);
				 }else {
					 System.out.println("NOT FOUND");
				 }
				 
			 }
			 
			 if(temp.terminal) {
				 temp.terminal = false;
			 }
			 
			 
		 }
		 
		 void autocomplete(String str) {
			 Node temp = root;
			 
			 for(char ch : str.toCharArray()) {
				 if(temp.children.containsKey(ch)) {
					 temp = temp.children.get(ch);
				 }else {
					 System.out.println("doesnot exist");
					 return;
				 }
			 }
			 dfs(temp, str, "");
			 
		 }
		 
		
		
	}
	
	 public static void main(String[] args) {
			TrieNode t = new TrieNode();
			t.insert("sam");
			t.insert("sammer");
			t.insert("samshesh");
			t.insert("mohit");
			t.autocomplete("m");
				
				
			
		}
	

}
