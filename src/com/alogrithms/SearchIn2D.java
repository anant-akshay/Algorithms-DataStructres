package com.alogrithms;

import java.util.ArrayList;

public class SearchIn2D {

	public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
		int l =0;
		int r =A.get(0).size()*A.size();
		int totalColumns = A.get(0).size();
		while(l<=r) {
			int mid = (l+r)/2;
			int row = mid / totalColumns;
			int col = mid % totalColumns;
			int num =A.get(row).get(col);
			if(num==B) {
				return 1;
			}else if(num >B) {
				r = mid-1;
			}else {
				l =mid+1;
			}
		}
		
		 return 0;
	  }
	
	
}
