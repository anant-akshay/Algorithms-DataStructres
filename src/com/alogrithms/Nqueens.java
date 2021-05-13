package com.alogrithms;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {
	
	
	static void solveNqueens(int n, int row, List<Integer>colPlacements,List<List<Integer>>result) {
		if(row == n) {
			result.add(new ArrayList<Integer>(colPlacements));
		}else {
			for(int col =0;col<n;col++) {
				colPlacements.add(col);
				if(isValid(colPlacements)) {
					solveNqueens(n, row+1, colPlacements, result);
				}
				colPlacements.remove(colPlacements.size()-1);
			}
		}
		
	}
	
	static boolean isValid(List<Integer> colPlacements) {
		int rowId = colPlacements.size()-1;
		for(int i=0;i<rowId;i++) {
			int diff = Math.abs(colPlacements.get(i)-colPlacements.get(rowId));
			if(diff==0 || diff == rowId-i) {
				return false;
			}
		}
		return true;
	}

	
	public static void main(String[] args) {
		int n =4;
		List<List<Integer>>result = new ArrayList<List<Integer>>();
		solveNqueens(n, 0, new ArrayList<Integer>() , result);
		System.out.println(result);
		
	}

}
