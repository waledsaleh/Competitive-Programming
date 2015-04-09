package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class TC_352_500 {
  static int[] dp = new int[1000001];
  static int count_zero=0,count_one=0;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = fiboCallsMade(22);
		System.out.println(a[0]+" "+a[1]);
		
	}
   public static  	int[] fiboCallsMade(int n)
   {
	  fib(n);
	   
	   return new int[]{count_zero,count_one};
   }
  public static int fib ( int n)
  {
	   if(n==0)
	   {
		   count_zero++;
		   return 0;
	   }
	   if(n==1)
	   {
		   count_one++;
		   return 1;
	   }
	   
	   return fib(n-1)+fib(n-2);
	   
  }
  
  
}
