package com.alogrithms;

import java.io.File;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;



public class Bst {
	
	
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		         this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
		 
	
	class Solution {
		TreeNode cur;
		public TreeNode increasingBST(TreeNode root) {
			TreeNode ans = new TreeNode(0);
			cur = ans;
			inorder(root);
			return ans.right;
		}
		
		
		void inorder(TreeNode root) {
			if(root == null)return;
			inorder(root.left);
			root.left = null;
			cur.right= root;
			cur = root;
			inorder(root.right);
		}
	}

}