package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class UVA_10305_TopSort {
	static boolean vis[];
	static Vector<Vector<Integer>>g;
	static Vector<Integer>top;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true)
		{
		int v = sc.nextInt();
		int m = sc.nextInt();
		if(v==0&&m==0)break;
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
		for(int i = 0 ; i <top.size();++i)
		{
			if(i==0)
			System.out.print(top.get(i)+1);
			else
				System.out.print(" "+(top.get(i)+1));
			
		}
		System.out.println();
		
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