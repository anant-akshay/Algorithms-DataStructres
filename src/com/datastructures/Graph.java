package com.datastructures;
import java.util.*;
import java.util.LinkedList;;;

public class Graph {
	
	private LinkedList<Integer> adj[];
	
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i = 0; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source , int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	//bfs
	public int bfs(int source, int destination) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean [] visted  = new boolean[adj.length];
		int[] parent = new int[adj.length];
		
		visted[source] =true;
		parent[source]=-1;
		int dist =0;
		queue.add(source);
		while(!queue.isEmpty()) {
			int x = queue.poll();
			if(x == destination)
				break;
			dist++;
			for(int val : adj[x]) {
				if(!visted[val]) {
					queue.add(val);
					parent[val] = x;
					visted[val] = true;
				}
			}
			
		}
		int cur = destination;
		while(parent[cur]!=-1) {
			System.out.print(cur+"-->");
			cur = parent[cur];
		}
		return dist;
		
	}
	
	//dfs 
	private boolean dfsUtil(int source,int destination,boolean[] visited) {
		
		if(source == destination)
			return true;
		
		for(int neighbor: adj[source]) {
			if(!visited[neighbor]) {
				visited[neighbor] = true;
				boolean isConnected = dfsUtil(neighbor, destination, visited);
				if(isConnected) return true;
			}
		}
		
		
		return false;
		
	}
	
	public boolean dfs(int source, int destination) {
		boolean visted[] = new boolean[adj.length];
		visted[source] =true;
		return dfsUtil(source, destination, visted);
	}
	
	
	public boolean dfsStack(int source, int destination) {
		
		if(source == destination)
			return true;
		
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] visted = new boolean[adj.length];
		visted[source] = true;
		stack.add(source);
		while(!stack.isEmpty()) {
			int x =stack.pop();
			if(x == destination) {
				return true;
			}
			for(int neighbor :adj[x]) {
				if(!visted[neighbor]) {
					stack.push(neighbor);
					visted[neighbor] = true;

				}
			}
		}
		return false;	
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vertices and edges");
		int v =sc.nextInt();
		int e =sc.nextInt();
		
		Graph graph =new Graph(v);
		System.out.println("enter edges");
		for(int i=0;i<e;i++) {
			int source =sc.nextInt();
			int destination = sc.nextInt();
			graph.addEdge(source, destination);
		}
		
		System.out.println("enter source and detination");
		int src = sc.nextInt();
		int dest = sc.nextInt();
		
		int distance = graph.bfs(src, dest);
		System.out.println("min distance is"+distance);
		
	}
	
	
	
}
