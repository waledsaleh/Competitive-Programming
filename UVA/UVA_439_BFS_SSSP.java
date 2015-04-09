package Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UVA_439_BFS_SSSP {
                static int[] dx = new int[]{2,2,-2,-2,1,-1,-1,1};
			    static int[] dy =new int[]{1,-1,-1,1,2,2,-2,-2};
	public static void main(String[] args) {

		 
		  Scanner sc = new Scanner(System.in);
		  
		  while(sc.hasNext())
		  {
			 
			  int n  = 8;
			  int m  = 8;
			  int i,j;
		  int[][] array = new int[n][m];
		  for(i=0;i<8;i++) for(j=0;j<8;j++)  array[i][j] = -1;
		        
		   Queue<Integer> qRow = new LinkedList<Integer>();
		   Queue<Integer> qCol = new LinkedList<Integer>();
		   String start=sc.next(),end=sc.next();
		 
		   array[end.charAt(1)-'1'][end.charAt(0)-'a']=1;   
		   
		      boolean[][] vis = new boolean[n][m];
		      int[][] cost = new int[n][m];
		 
		  cost[start.charAt(1)-'1'][start.charAt(0)-'a']=0;
		  vis[start.charAt(1)-'1'][start.charAt(0)-'a']=true;
		  
		  qRow.offer(start.charAt(1)-'1');
		  qCol.offer(start.charAt(0)-'a');
		  
		  while(!qRow.isEmpty())
		  {
			  
		  int r = qRow.poll();
		  int c=  qCol.poll();
		  //To get from e2 to e4 takes 2 knight moves.
		  if(array[r][c]==1){System.out.println("To get from "+start+" to "+end+" takes "+cost[r][c]+" knight moves.");break;}
		  
		  for (int dr = 0; dr <8;++dr){
			 
					  int nr = r + dx[dr]; int nc = c + dy[dr];
					  if(nr<0 || nr>=n || nc<0 || nc>=m) continue;
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
