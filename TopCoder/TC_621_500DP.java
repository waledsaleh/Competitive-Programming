package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class TC_621_500DP {
  
   
	public static void main(String[] args) throws IOException {
		
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println(MinNumber(new int[]{5,1,2}));
	
	
	
	}
	static int  MinNumber(int[] S)
	{
	
		boolean f= false;
		int n  = S.length;
		int res = 2;
		int[] p = new int[2_000_001];
		
		for(long i = 0; i < (1<<n); i++){
			
		    int sum =0;
		    
		    for(int j = 0; j < n; j++){
		        if((i&1<<j) > 0){ // bit j is on
		           sum +=S[j];
		        }
		    }
		  p[sum]=1;
		  
		    
		}
		
		   for(int j = 1;j<=2_000_001 ; j++){
			   if(p[j]==0)return j;
			   
		   }
		
		return res;
		
	}
}
