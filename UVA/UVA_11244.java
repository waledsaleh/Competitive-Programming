package Main;

import java.util.Scanner;
import java.util.Vector;

public class UVA_11244{
	
	static boolean vis[][];
	static char[][]g;
   static int count =0;
   static int res=0;
   static int dr[]={-1,-1,0,1,1,1,0,-1};
   static int dc[]={0,1,1,1,0,-1,-1,-1};
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
		 int n  =sc.nextInt();
		 int m =sc.nextInt();
		 if(n==0&&m==0)break;
		 
		 vis=new boolean[n][m];
		g=new char[n][m];
		
		for(int i = 0 ; i < n ; ++i){String r = sc.next();for(int j = 0 ; j < m ;++j)g[i][j]=r.charAt(j);}
		
		 
		 for(int i=0;i<n;++i){
			
			 for(int j = 0 ; j <m ;++j)
			 {
				 if(g[i][j]=='*')
				 {
					
			    if(!vis[i][j])
			    {
			    	 count =1;
			   DFS(i,j,n,m);
			    if(count==1)res++;
			    
			    }
			    
			    
				 }
			    
			     
			 }
			
		
		 }
		 System.out.println(res);
		 res =0;
		
		 
		}
		
	}
	static void DFS(int r, int c,int R,int C){
		vis[r][c] = true;
		for (int i = 0; i < 8; ++i)
		{
		int nr = r + dr[i];
		int nc = c + dc[i];
		
		if (nr < 0 || nr == R || nc < 0 || nc == C || vis[nr][nc]|| g[nr][nc]!='*')
		continue;
		
		if(g[r][c]=='*')count++;
		
		DFS(nr, nc,R,C);
		
		}
		
		}
	   
	
}
