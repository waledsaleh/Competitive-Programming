package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_10048_FLOYD {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc= new Scanner(System.in);
		int count =1;boolean isThere = false;
		while(true)
		{
			
		int i, j, k, V, E, a, b, weight;
	V = sc.nextInt();
    E = sc.nextInt();
    int Q=sc.nextInt();
    if(V==0 && E==0 && Q==0)break;
    if(isThere){
    	 System.out.println();
    	}
    	isThere = true;
 
    
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

    for (k = 0; k < V; k++){ // O(v^3) Floyd Warshall's code is here
    	
      for (i = 0; i < V; i++){
    	
        for (j = 0; j < V; j++){
        	
        	    	
        	AdjMat[i][j]=Math.min(AdjMat[i][j],Math.max(AdjMat[i][k],AdjMat[k][j]));          
        }
      }
    }
    System.out.println("Case #"+count);
    
   while(Q-->0)
   {
	   int f = sc.nextInt()-1,s=sc.nextInt()-1;
	   if(AdjMat[f][s]== 1000000000)System.out.println("no path");
	   else
		   System.out.println(AdjMat[f][s]);
	   
   } 
  
     ++count;
   
		}
	}

}