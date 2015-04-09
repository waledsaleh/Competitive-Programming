package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CF_405C {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	    
              Scanner sc = new Scanner(System.in);
             // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
              int n = Integer.parseInt(br.readLine());
             int[][] array = new int[n][n];
              StringTokenizer st;
             
              
             for(int i = 0 ; i <n;++i)
             {
            	 st = new StringTokenizer(br.readLine());
            	 for(int j = 0 ; j <n;++j)
            	 {
            		 array[i][j]=Integer.parseInt(st.nextToken());
            		
            	 }
             }
              int res = 0;
              for(int i = 0 ; i <n;++i)
              {
            	  for(int j  = 0 ; j <n;++j)res ^=(array[i][j]&array[j][i]);
              }
             int q = Integer.parseInt(br.readLine());
             int s=0;
             String con="";
             while(q-->0)
             {
               
            	 st = new StringTokenizer(br.readLine());
            	  s = Integer.parseInt(st.nextToken());
            	 
             if(s==3)out.print(res);
             
             else
             {
            	 int z = Integer.parseInt(st.nextToken());
            	 res ^=1;
            	 
             }
             
             }
             
             
          
          out.close();
             
	}
	
}
