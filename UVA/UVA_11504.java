package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_11504{

	static boolean vis[];
	static Vector<Vector<Integer>>g;
	static Vector<Integer>top;
	
	public static void main(String[] args) throws IOException {
        
		Scanner sc = new Scanner(System.in);
       
        StringBuilder sb = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		 vis = new boolean[v];
		 g=new Vector<Vector<Integer> >();
		 top = new Vector<Integer>();
		for(int i = 0 ; i <v ;++i)g.add(new Vector<Integer>());
		
		while(m-->0)
		{
			st = new StringTokenizer(br.readLine());
			int from=Integer.parseInt(st.nextToken())-1;
			int to = Integer.parseInt(st.nextToken())-1;
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
		sb.append(count+"\n");
	
	
		
		}
		System.out.print(sb);
		
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
