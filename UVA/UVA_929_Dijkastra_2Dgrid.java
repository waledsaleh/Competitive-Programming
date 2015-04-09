package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UVA_929_Dijkastra_2Dgrid {
	  public static final int INF = 1000000000;
	 

	public static void main(String[] args) throws IOException {
		
	           	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		            Scanner sc = new Scanner(System.in);
		            
                   StringBuilder sb = new StringBuilder(""); 
                   
		            int test =Integer.parseInt(br.readLine());
		            while(test-->0)
		            {
		            int V, E, s; 
		          V = Integer.parseInt(br.readLine());
		            E = Integer.parseInt(br.readLine());
		          int[][] array = new int[V][E];
		           
		            int[][]cost = new int[1000][1000];
		            String[] sp;
		            for (int i = 0; i < V; i++){sp=br.readLine().split(" ");for(int j = 0 ; j < E ;++j)array[i][j]=Integer.parseInt(sp[j]);}
		            	
                s = array[0][0];
               
                for (int i = 0; i < V; i++)for(int j = 0 ; j < E ;++j)cost[i][j]=INF;
                cost[0][0]=s;
		          
                
		     PriorityQueue <Node> pq = new PriorityQueue < Node >();
		    	      
		            pq.offer(new Node(0,0,array[0][0]));
		             // sort based on increasing distance

		            while (!pq.isEmpty()) { // main loop
		             
		            	Node node=pq.poll();
		            	  if(node.element0==V-1&&node.element1==E-1){System.out.println(node.element3);break;}
		            	 
		              for (int dr = -1; dr <= 1;++dr){
						  for (int dc = -1; dc <= 1;++dc){
							  if (dr == 0 || dc == 0){
								  int nr =node.element0 + dr; int nc = node.element1 + dc;
								  if(nr<0 || nr>=V || nc<0 || nc>=E) continue;
								  
					       int newCost =cost[node.element0][node.element1]+array[nr][nc];
					  
								  if(newCost<cost[nr][nc]){
									  Node ne = new Node(nr, nc, node.element3 + array[nr][nc]);
									  cost[nr][nc]=newCost;
									    pq.offer(ne);
									    
								  }
									
								  
							  }
						  }
						  
		              }
		            }
		               
		            
		            }
		          
		        
		            
	}
		            
		            
	
		           
		            
	}

 class Node  implements Comparable<Node>{

    public final int element0;
    public final int element1;
    public final int element3;
  

    public Node(int element0, int element1,int c) {
        this.element0 = element0;
        this.element1 = element1;
        this.element3=  c;
    }
    public int compareTo(Node o) {
        return this.element3 - o.element3;
    }
   
    
    
}
