package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class UVA_871 {
	 static int dr[]={-1,-1,0,1,1,1,0,-1};
	   static int dc[]={0,1,1,1,0,-1,-1,-1};
	   
	 static boolean vis[][];
	 static int[][]g;
	 static int count =0;
	 
	public static void main(String[] args) throws  IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int test = Integer.parseInt(br.readLine());
       
        br.readLine();
        
        while(test-->0)
        {
        	String line = br.readLine();
        	vis = new boolean[line.length()][line.length()];
        	g = new int[line.length()][line.length()];
        	int max =0;
        	int i=0;
        	
        	 while(line !=null && !line.equals(""))
             {
        		
        		  for( ; ;)
        			{
        				for(int j = 0; j <line.length();++j)
        				{
        					if(line.charAt(j)=='1')g[i][j]=1;
        					
        				}
        				++i;
        				break;
        			}
        		  
        		 line=br.readLine();
        		
        		 
             }
        	
       
        for( i = 0 ; i<g.length;++i)
		{
			for(int j = 0; j <g.length;++j)
			{
				if(g[i][j]==1)
				{
					
				if(!vis[i][j])
				{
					count =1;
				DFS(i,j,g.length,g.length);
			
			max = Math.max(max, count);
				}
				
				}
			}
			
		
        
        }
        
        System.out.println(max);
       
   if(test>0){System.out.println(); max =0;}
   
   
        }
        
        
	}
	static void DFS(int r, int c,int R,int C){
		vis[r][c] = true;
		for (int i = 0; i < 8; ++i)
		{
		int nr = r + dr[i];
		int nc = c + dc[i];
		
		if (nr < 0 || nr == R || nc < 0 || nc == C || vis[nr][nc]|| g[nr][nc] != 1)
		continue;
		
		++count;
		
		DFS(nr, nc,R,C);
		
		}
		
		}
	
}