package Main;

import java.util.Scanner;

public class SPOJ_1000{
 static boolean[][] vis;
 static int dr[] = { -1, 1, 0, 0 };
 static int dc[] = { 0, 0, -1, 1 };
 static int[][] grid ;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true)
		{
			int n = sc.nextInt();
			if(n==0)break;
			 grid = new int[n][n];
			vis  = new boolean[n][n];
			
			for(int i = 1 ; i <n;++i)
			{
				for(int j =1;j<=n;++j)
				{
					grid[sc.nextInt()-1][sc.nextInt()-1]=i;
					
				}
				sc.nextLine();
			}
			
			for(int i = 0 ; i <n;++i)
			{
				for(int j =0;j<n;++j)
				{
					if(grid[i][j]==0)
					grid[i][j]=n;
					
				}
			}
			int count =0;
			for(int i = 0 ; i<n;++i)
			{
				for(int j = 0; j <n;++j)
				{
					if(!vis[i][j])
					{
					DFS(i,j,n,n);count++;
					}
				}
			}
		if(count==n)System.out.println("good");
		else
			System.out.println("wrong");
		}
		
		
	}
	static void DFS(int r, int c,int R,int C){
		vis[r][c] = true;
		for (int i = 0; i < 4; ++i)
		{
		int nr = r + dr[i];
		int nc = c + dc[i];
		
		if (nr < 0 || nr == R || nc < 0 || nc == C || vis[nr][nc] || grid[nr][nc]!=grid[r][c])
		continue;
		
		DFS(nr, nc,R,C);
		
		}
		
		}
 
}
