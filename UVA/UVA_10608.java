package Main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class UVA_10608 {
	static boolean vis[];
	static Vector<Vector<Integer>>g;
	static int max = 0;
	static int count =1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int test =sc.nextInt();
		while(test-->0)
		{
		int n = sc.nextInt();
		int m = sc.nextInt();
		vis=new boolean[n];
		g=new Vector<Vector<Integer>>(n);
		for(int i = 0 ; i < n ;++i)g.add(new Vector<Integer>());
		
		Arrays.fill(vis, false);
		
		while(m-->0)
		{
			int first = sc.nextInt()-1;
			int sec = sc.nextInt()-1;
			g.get(first).add(sec);
			g.get(sec).add(first);
		}
		
		
		 for(int i=0;i<n;++i){
			    if(!vis[i])
			    {
			     count =1;
			   DFS(i);
		       
			    }
			    
		 }
			System.out.println(max);
			max=0;
		
			  
		 }
		
		
	}
	 static void DFS(int u)
	   {
	   vis[u]=true;
	
	   for(int i=0;i<g.get(u).size();++i)
	   {
	   if(!vis[g.get(u).get(i)])
	   {
		 count++;
	   DFS(g.get(u).get(i));
	   
	    
	   }
	 
	   }
	   
	   max = Math.max(max, count);
	   
	   }
}

