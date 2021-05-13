package com.datastructures;

public class CircularQueue {
	int[] arr;
	int front =-1;
	int rear =-1;
    public CircularQueue(int k) {
        arr = new int[k];
    }
    
    public boolean enQueue(int value) {
    	if(isEmpty()) {
    		front++;
    		rear++;
    		arr[rear] = value;
    		return true;
    	}
    	else if(isFull()) {
    		return false;
    	}else {
    		rear =(rear +1 ) %arr.length;
    		arr[rear] =value;
    		return true;
    	}
        
    }
    
    public boolean deQueue() {
    	if(isEmpty()) {
    		return false;
    	}
    	else if(front == rear) {
    		front = -1;
    		rear =-1;
    		return true;
    	}
    	else {
    		front =(front+1)%arr.length;
    		return true;
    		
    	}
        
    }
    
    public int Front() {
    	if(front == -1) {
    		return -1;
    	}
    	return arr[front];
        
    }
    
    public int Rear() {
    	if(rear ==-1) {
    		return -1;
    	}
        return arr[rear];
    }
    
    public boolean isEmpty() {
    	if(front ==-1 && rear ==-1) {
    		return true;
    	}
        return false;
    }
    
    public boolean isFull() {
    	
    	if((rear +1) % arr.length == front) {
    		return true;
    	}
        return false;
    }
	
	
	

}

