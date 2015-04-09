package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_10684  {
   
	public static void main(String[] args) throws  IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int n = sc.nextInt();
			if(n==0)break;
			int[]array = new int[n];
			for(int i = 0 ; i < n ;++i)array[i]=sc.nextInt();
			int max =Integer.MIN_VALUE;
			
			int max2=0;
			for(int i = 0 ; i <array.length;++i)
			{
				max2 = Math.max(max2+array[i], array[i]);
				max = Math.max(max, max2);
			}
			
			
			if(max>0)
			System.out.println("The maximum winning streak is "+max+".");
			else
			 System.out.println("Losing streak.");
		}
	}
	
		
}
