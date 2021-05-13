package com.alogrithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import com.alogrithms.Node;


//public class Node implements Comparator<Node>{
//	public int node;
//	public int cost;
//	
//	public Node(int node,int cost) {
//		this.node=node;
//		this.cost=cost;
//	}
//	
//	@Override
//	public int compare(Node o1, Node o2) {
//		// TODO Auto-generated method stub
//		if(o1.cost>o2.cost)
//			return 1;
//		if(o1.cost<o2.cost)
//			return -1;
//		return 0;
//	}
//	
//}

public class Dijakstra {
	private int dist[];
	private int v;
	private Set<Integer> settled;
	private PriorityQueue<Node> pq;
	List<List<Node>>adj;
	
	public Dijakstra(int v) {
		// TODO Auto-generated constructor stub
		this.v=v;
		settled = new HashSet<Integer>();
		dist = new int[v];
		pq = new PriorityQueue<Node>(v,new Node());
	}
	
	public void dijakstra(List<List<Node>>adj,int src) {
		this.adj = adj;
		for(int i=0;i<v;i++)
			dist[i] = Integer.MAX_VALUE;
		pq.add(new Node(src,0));
		dist[src]=0;
		while(pq.size()!=0) {
			int u = pq.remove().node;
			settled.add(u);
			e_nighbours(u);
		}
		
	}
	
	public void e_nighbours(int u) {
		// TODO Auto-generated method stub
		int edgeDistance=-1,newDistance=-1;
		
		for(int i =0;i<adj.get(u).size();i++) {
			Node v = adj.get(u).get(i);
			if(!settled.contains(v.node)) {
				edgeDistance = v.cost;
				newDistance = dist[u] +edgeDistance;
				
				if(newDistance < dist[v.node] ) {
					dist[v.node] = newDistance;
					pq.add(new Node(v.node,dist[v.node]));
				}
				
			}
		}
		
	}

	
	
	
	public static void main(String[] args) {
		int v =5;
		int source =0;
		List<List<Node>>adj = new ArrayList<List<Node>>();
		for(int i=0;i<v;i++) {
			List<Node> item = new ArrayList<Node>();
			adj.add(item);
		}
		adj.get(0).add(new Node(1, 1));
		adj.get(0).add(new Node(2, 2));
		adj.get(1).add(new Node(2, 1));
		adj.get(2).add(new Node(3, 1));

		adj.get(3).add(new Node(4, 1));
		adj.get(4).add(new Node(0, 3));
		adj.get(4).add(new Node(2, 1));
        
        Dijakstra d = new Dijakstra(v);
        d.dijakstra(adj, source);
        System.out.println("The shorted path from node :"); 
        for (int i = 0; i < d.dist.length; i++) 
            System.out.println(source + " to " + i + " is "
                               + d.dist[i]); 
        
        
	}
	
	
	
	
	

}
