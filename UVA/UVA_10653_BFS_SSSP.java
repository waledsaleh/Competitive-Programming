package Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UVA_10653_BFS_SSSP {

	public static void main(String[] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  
		  while(true)
		  {
			  int n  = sc.nextInt();
			  int m  = sc.nextInt();
			  if(n==0&&m==0)break;
			  
		  int[][] array = new int[n][m];
		int bomb = sc.nextInt();
		while(bomb-->0)
		{
			int num =sc.nextInt();
			int r = sc.nextInt();
			while(r-->0)
			{
				int b  =sc.nextInt();
				array[num][b]=-1;
				
			}
		}
		  
		   Queue<Integer> qRow = new LinkedList<Integer>();
		   Queue<Integer> qCol = new LinkedList<Integer>();
		   int start=sc.nextInt(),end=sc.nextInt();
		   array[start][end]=1;   
		   
		      boolean[][] vis = new boolean[n][m];
		  int[][] cost = new int[n][m];
		  start=sc.nextInt();
		  end=sc.nextInt();
		  
		  cost[start][end]=0;
		  vis[start][end]=true;
		  qRow.offer(start);
		  qCol.offer(end);
		  
		  while(!qRow.isEmpty())
		  {
			  
		  int r = qRow.poll();//poll() retrieves and removes last element
		  int c=qCol.poll();
		  if(array[r][c]==1){System.out.println(cost[r][c]);break;}
		  
		  for (int dr = -1; dr <= 1;++dr){
			  for (int dc = -1; dc <= 1;++dc){
				  if (dr == 0 || dc == 0){
					  int nr = r + dr; int nc = c + dc;
					  if(nr<0 || nr>=n || nc<0 || nc>=m) continue;
					  if(vis[nr][nc])continue;
					  if(array[nr][nc]==-1)continue;
					  
						  cost[nr][nc]=cost[r][c]+1;
						  qRow.offer(nr);
						  qCol.offer(nc);
						  vis[nr][nc]=true;
				  }
			  }
		  }
		  
		  
		  }
		
	}
		  
	}

}
