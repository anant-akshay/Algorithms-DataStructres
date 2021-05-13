package com.datastructures;

import java.util.HashMap;

public class Trie {
	
	private class TrieNode{
		HashMap<Character, TrieNode> chidren;
		boolean endOfWord;	
		
		public TrieNode() {
			chidren = new HashMap<Character,TrieNode>();
			endOfWord = false;
		}
	}
	
	private final TrieNode root;
	
	public Trie() {
		root = null;
	}
	
	//insert
	
	public void insert(String word) {
		TrieNode current = root;
		for(int i =0;i<word.length();i++) {
			char ch = word.charAt(i);
			TrieNode node = current.chidren.get(ch);
			
			if(node == null) {
				node = new TrieNode();
				current.chidren.put(ch, node);
			}
			current = node;
		}
		current.endOfWord = true;
	}
	
	
	// search
	
	public boolean search(String word) {
		TrieNode current = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			TrieNode node = current.chidren.get(ch);
			if(node == null) {
				return false;
			}
			current = node;
		}
		return current.endOfWord;
	}
	
	// delete 
	
	public void delete(String word) {
		delete(word,root,0)
		
		
	}

	private boolean delete(String word, TrieNode root, int index) {
		
		if(index == word.length()) {
			if(!root.endOfWord) {
				return false;
			}
			root.endOfWord = false;
			
			return root.chidren.size() == 0;
		}
		char ch = word.charAt(index);
		TrieNode node = root.chidren.get(ch);
		delete(word, node, index+1);
		
		if(node == null) {
			return false;
		}
		
		boolean shouldDeleteCurNode = delete(word, node, index);
		
		if(shouldDeleteCurNode) {
			root.chidren.remove(ch);
			return root.chidren.size() ==0;
		}
		
		
		return false;
		
	}

}
