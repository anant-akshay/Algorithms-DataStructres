package com.datastructures;

public class MaxHeap {
	private int[] heap;
	private int maxSize;
	private int size;
	
	public MaxHeap(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		heap = new int[maxSize+1];
		heap[0] = Integer.MAX_VALUE;
	}
	private int parent(int pos) {
		return pos/2;
	}
	
	private int rightchild(int pos) {
		return 2*pos+1;
	}
	private int leftchild(int pos) {
		return 2*pos;
	}
	private boolean isLeaf(int pos) {
		if(pos >= (size/2) && pos >= size)
			return true;
		return false;
	}
	
	private void swap(int fpos, int spos) {
		int temp = heap[fpos];
		heap[fpos] = heap[spos];
		heap[spos] = temp;
	}
	
	public void insert(int elem) {
		heap[++size] = elem;
		int current = size;
		while (heap[parent(current)] < heap[current]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}
	private void maxHeapify(int pos) {
		if(isLeaf(pos)) {
			return;
		}
		if(heap[pos]<heap[leftchild(pos)] || heap[pos] < heap[rightchild(pos)]) {
			if(heap[leftchild(pos)]>heap[rightchild(pos)]) {
				swap(pos,leftchild(pos));
				maxHeapify(leftchild(pos));
			}
			else {
				swap(pos, rightchild(pos));
				maxHeapify(rightchild(pos));
			}
		}
	}
	
	
	
	public int extractMax() {
		int poped = heap[1];
		heap[1] = heap[size--];
		maxHeapify(1);
		return poped;
	}
	public void print() {
		  for(int i =1;i<=size;i++) {
	         System.out.print(heap[i]+" ");	
	        }
		
	}
	
	public static void main(String[] args) {
		System.out.println("The Max Heap is "); 
        MaxHeap maxHeap = new MaxHeap(15); 
        maxHeap.insert(5); 
        maxHeap.insert(3); 
        maxHeap.insert(17); 
        maxHeap.insert(10); 
        maxHeap.insert(84); 
        maxHeap.insert(19); 
        maxHeap.insert(6); 
        maxHeap.insert(22); 
        maxHeap.insert(9); 
        
        maxHeap.print();
        System.out.println("");
        System.out.println("Max element "+maxHeap.extractMax());
        maxHeap.print();
        
      
	}
	
	
	

}
