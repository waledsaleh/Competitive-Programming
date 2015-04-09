package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_11059 {

	static long max=0;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int c = 1;
		while(sc.hasNext())
		{
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0 ; i<n;++i)array[i]=sc.nextInt();
		max = 0;
		
	/*	for(int i = 0  ; i < n ; ++i)
		{
			long prod = 1;
			for(int j= i ; j < n ;++j)
			{
				prod *=array[j];
				max= Math.max(max, prod);
			}
				
		}
		*/
		for(int i= 0 ; i < n ;++i)
		{
			if(array[i]!=0)
			Maximum(array,i+1,array[i]);
		}
		
		System.out.println("Case #"+c+": The maximum product is "+max+".\n");
		c++;
		max =0;
		}
	}
	public static void Maximum(int[]array,int i ,long total)
	{
		
		if(i>=array.length)
		{
			 max=Math.max(max, total);
		  return ;
		}
		
		Maximum(array,i+1,total*array[i]);
	
		 max=Math.max(max, total);
		 
	}
	
}
