package Main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class UVA_11838_SCC {
	
	   static final int DFS_WHITE = -1; // normal DFS
	   static Vector < Vector < IntegerPair > > AdjList ;
	   static Vector < Integer > dfs_num, dfs_low, dfs_parent;
	   static Vector < Boolean >  visited;
	   static Stack < Integer > S; // additional information for SCC
	  static int numComp, dfsNumberCounter;
	  static boolean  check = false;
	  static Vector<Integer>v;
	public static void main(String[] args) {
		
        int count =0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		int i, j, V, total_neighbors, id, weight;
		  V = sc.nextInt();
		  int m = sc.nextInt();
		  if(V==0&&m==0)break;
		
		 AdjList =new Vector < Vector < IntegerPair > >();
		 // AdjList.clear();
		    for (i = 0; i < V; i++) {
		      Vector < IntegerPair > Neighbor = new Vector < IntegerPair >(); // create vector of pair<int, int> 
		      AdjList.add(Neighbor); // store blank vector first
		    }

		//     System.out.println(AdjList.size());
		     while(m-->0)
		     {
		    	 int first = sc.nextInt()-1;
		    	 int sec = sc.nextInt()-1;
			     int p =sc.nextInt();
			        weight = 0;
			        if(p==1)
			        AdjList.get(first).add(new IntegerPair(sec, weight));
			        else
			        {
			        	AdjList.get(first).add(new IntegerPair(sec, weight));
			        	AdjList.get(sec).add(new IntegerPair(first, weight));
			        }
		 
		     }
	 
	    initDFS(V); // call this first before running DFS
	    initTarjanSCC(V);
	v = new Vector<Integer>();
		 for (i = 0; i < V; i++){
		      if (dfs_num.get(i) == DFS_WHITE){
		    	 
		        tarjanSCC(i);
		      }
		 }
		if(v.size()==1)System.out.println(1);
		else if(v.size()>1)System.out.println(0);
		else
		{
			for(int k : v )
			{
				if(k==1){System.out.println(0);break;}
					
			}
		}
		
		}
	}
	 private static void tarjanSCC(int u) {
		    dfs_num.set(u, dfsNumberCounter);
		    dfs_low.set(u, dfsNumberCounter++); // dfs_low[u] <= dfs_num[u]
		    S.push(u); // store u according to order of visitation
		    visited.set(u, true);

		    Iterator it = AdjList.get(u).iterator();
		    while (it.hasNext()) { // try all neighbors v of vertex u
		      IntegerPair v = (IntegerPair)it.next();
		      if (dfs_num.get(v.first()) == DFS_WHITE) // a tree edge
		        tarjanSCC(v.first());
		      if (visited.get(v.first())) // condition for update
		        dfs_low.set(u, Math.min(dfs_low.get(u), dfs_low.get(v.first())));
		    }
            int c =1;
		    if (dfs_low.get(u) == dfs_num.get(u)) { // if this is a root (start) of an SCC
		    //  System.out.printf("SCC %d: ", ++numComp);
		    	
		      while (true) {
		        int v = S.peek(); S.pop(); visited.set(v, false);
		      //  System.out.printf("%d ", v+1);
		        if (u == v) break;
		       c++;
		       
		      }
		     // System.out.printf("\n");
		     v.add(c);
		    }
		   
		    	
		    	
		  
	 }
	 private static void initTarjanSCC(int V) {
		    initGraphCheck(V);
		    dfs_low = new Vector < Integer > ();
		    dfs_low.addAll(Collections.nCopies(V, 0));
		    dfsNumberCounter = 0;
		    numComp = 0;
		    S = new Stack < Integer > ();
		    visited = new Vector < Boolean > ();
		    visited.addAll(Collections.nCopies(V, false));
		  }
	 private static void initGraphCheck(int V) {
		    initDFS(V);
		    dfs_parent = new Vector < Integer > ();
		    dfs_parent.addAll(Collections.nCopies(V, 0));
		    numComp = 0;
		  }
	 private static void initDFS(int V) { // used in normal DFS
		    dfs_num = new Vector < Integer > ();
		    dfs_num.addAll(Collections.nCopies(V, DFS_WHITE));
		    numComp = 0;
		  }
}
