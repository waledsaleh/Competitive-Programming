package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_230 {
	public static void main (String [] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	    
	     int[] a = getDifferences(50);
	     for(Integer j : a)System.out.print(j+" ");
	     
	}
	
	public static int[] getDifferences(int n)
	{
		//s = 1^3 + 2^3 + ... + (n-1)^3 < n^4/4 < 1^3 + 2^3 + ... + n^3 = S
		int s =0;
		for(int i = 1 ;i <n;++i) s += (int)Math.pow(i, 3);
		int S=0;
		for(int i = 1 ;i <=n;++i) S +=(int) Math.pow(i, 3);
		
		int first = (S+s);
		int sec =2;
		int third =(int) Math.pow(n, 4);
		int fourth = 4;
		
		int res1 = sec*fourth;
		int num=sec*(-third) + fourth*first;
		int[] a = new int[2];
		int gcd = GCD(num,res1);
		a[0]=num/gcd;
		a[1]=res1/gcd;
				
		return a;
		
		
	}
	public static int GCD(int a , int b)
	{
		if(a==0||b==0)return a+b;
		return GCD(b,a%b);
	}
}
