package Main;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class UVA_10004 {
	 private static int V, E, a, b, s;
	 static boolean vis[];
		static Vector<Vector<Integer>>g;
   static boolean color[];
  static boolean bipartite=true;
		 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
   while(true)
   {
		    V = sc.nextInt();
		    if(V==0)break;
		    E = sc.nextInt();
		    bipartite=true;
   vis = new boolean[V];
   color = new boolean[V];
		   // g.clear();
   g=new Vector<Vector<Integer>>();
		    for (int i = 0; i < V; i++) {
		    
		      g.add(new Vector<Integer>()); // add neighbor list to Adjacency List
		    }

		    for (int i = 0; i < E; i++) {
		      a = sc.nextInt();
		      b = sc.nextInt();
		      g.get(a).add(b);
		      g.get(b).add(a);
		    }

		    for(int i=0;i<V;++i){
		        if(!vis[i]){
		        color[i]=false;	
		        
		       DFS(i);
		       
		       
		        }
		    }
		    
		    System.out.println(bipartite ? "BICOLORABLE." : "NOT BICOLORABLE.");
		    
   }
   
   
	    
	}
	  static void DFS(int u)
	   {
		  
	   vis[u]=true;
	   for(int i=0;i<g.get(u).size();++i){
	   if(!vis[g.get(u).get(i)]){
		   color[g.get(u).get(i)]= !color[u];
	   
	   DFS(g.get(u).get(i));
	   
	   
	   }
	   else if (color[g.get(u).get(i)] == color[u])
	   {
		   bipartite=false;
		   
	   }
	   
	   }
	   
	   }

	

}
