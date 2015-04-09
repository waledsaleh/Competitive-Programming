package Main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class UVA_11015_Floyd {
	public static void main(String[] args) throws Exception {
		
		Scanner sc= new Scanner(System.in);
		int count =1;
		while(true)
		{
			
		int i, j, k, V, E, a, b, weight;
	V = sc.nextInt();
    E = sc.nextInt();
    if(V==0)break;
    
    Vector<String>v =new Vector<String>();
    for( i = 0 ; i < V;++i)v.add(sc.next());
    
    int[][] AdjMat = new int[V][];
    for (i = 0; i < V; i++) {
      AdjMat[i] = new int[V];
      for (j = 0; j < V; j++)
        AdjMat[i][j] = 1000000000; // use 1.10^9 to avoid overflow
      AdjMat[i][i] = 0;
    }

    for (i = 0; i < E; i++) {
      a = sc.nextInt()-1;
      b = sc.nextInt()-1;
      weight = sc.nextInt();
      AdjMat[a][b] = weight; // directed graph
      AdjMat[b][a]=weight;
    }

    for (k = 0; k < V; k++) // O(v^3) Floyd Warshall's code is here
      for (i = 0; i < V; i++)
        for (j = 0; j < V; j++)
          AdjMat[i][j] = Math.min(AdjMat[i][j], AdjMat[i][k] + AdjMat[k][j]);
                        

    Vector<Integer>sum = new Vector<Integer>();
    for (i = 0; i < V; i++){
    	int dis =0;
    
      for (j = 0; j < V; j++){
    	  if(i==j)continue;
         dis +=AdjMat[i][j];
    
      }
      sum.add(dis);
    }
     int min = Integer.MAX_VALUE;
     int index =0;
     for( i = 0; i <sum.size();++i)
     {
    	 if(sum.elementAt(i)<min)
    	 {
    		 min = sum.elementAt(i);
    		 index =i;
    	 }
     }
    
     System.out.println("Case #"+count+" : "+v.elementAt(index));
     ++count;
     
		}
	}
}
