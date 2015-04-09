package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_100_REC {
	
	private static final String DIGIT_TABLE = "0123456789abcdef";
	
	public static void main(String[] args) throws IOException {
   
		 Scanner sc = new Scanner(System.in);
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 while(sc.hasNext())
		 {
		long n  = sc.nextLong();
		long m  =sc.nextLong();
		boolean check = false;
		if(n>m)
		{
			check = true;
			n ^=m;
			m ^=n;
			n ^=m;
		}
		long max = Long.MIN_VALUE;
		for(long  i = n ; i <=m;++i)
		max = Math.max(max,printInt(i));
		if(!check)
		System.out.println(n+" "+m +" "+max);
		else
			System.out.println(m+" "+n +" "+max);
		 }
	}
	
   public static long printInt(long n)
  {
	 if(n==1)return 1;
	 if(n%2==0)return 1+printInt(n/2);  
	 return 1+printInt(3*n+1);
	 
  }
  
  
}
