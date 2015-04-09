package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_11770_TopSort_InDegree {

	static boolean vis[];
	static Vector<Vector<Integer>>g;
	static Vector<Integer>top;
	
	public static void main(String[] args) {
         int c = 1;
		Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
		while(test-->0)
		{
		int v = sc.nextInt();
		int m = sc.nextInt();
	
		 vis = new boolean[v];
		 g=new Vector<Vector<Integer> >();
		 top = new Vector<Integer>();
		for(int i = 0 ; i <v ;++i)g.add(new Vector<Integer>());
		while(m-->0)
		{
			int from=sc.nextInt()-1;
			int to = sc.nextInt()-1;
			g.get(from).add(to);
			
		}
	    for (int i = 0; i < v; i++)
	        if (!vis[i])
	          DFS(i);
	    
	    Collections.reverse(top);
	    vis = new boolean[v];
	    int count =0;
	  
		for(int i = 0 ; i <top.size();++i)
		{
			if(!vis[top.elementAt(i)]){
				DFS(top.elementAt(i));
			    count++;	
			}
		}
		System.out.println("Case "+c+": "+count);
	
		c++;
		
		}
		
		
	}
	static void DFS(int u)
	   {
	   vis[u]=true;
	   for(int i=0;i<g.get(u).size();++i)
	   if(!vis[g.get(u).get(i)])
	   DFS(g.get(u).get(i));
	   
	   top.add(u);
	   
	   }
}
