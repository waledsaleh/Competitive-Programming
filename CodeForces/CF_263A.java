package Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CF_263A {

	public static void main(String[] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  int[][] array = new int[5][5];
		  for(int  i = 0 ; i <5 ;++i)for(int j = 0 ; j <5 ;++j)array[i][j]=sc.nextInt();
		  
		   Queue<Integer> qRow = new LinkedList<Integer>();
		   Queue<Integer> qCol = new LinkedList<Integer>();
		      
		      boolean[][] vis = new boolean[5][5];
		  int[][] cost = new int[5][5];
		  cost[2][2]=0;
		  vis[2][2]=true;
		  qRow.offer(2);
		  qCol.offer(2);
		  
		  while(!qRow.isEmpty())
		  {
			  
		  int r = qRow.poll();//poll() retrieves and removes last element
		  int c=qCol.poll();
		  if(array[r][c]==1){System.out.print(cost[r][c]);return;}
		  
		  for (int dr = -1; dr <= 1;++dr){
			  for (int dc = -1; dc <= 1;++dc){
				  if (dr == 0 || dc == 0){
					  int nr = r + dr; int nc = c + dc;
					  if(nr<0 || nr>=5 || nc<0 || nc>=5) continue;
					  if(vis[nr][nc])continue;
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
