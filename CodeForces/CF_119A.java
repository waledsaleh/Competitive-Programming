package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CF_119A {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int a =sc.nextInt(),
			b=sc.nextInt();
	
			int n = sc.nextInt();
			System.out.println(solution(a,b,n));


	}
			
	
	
	public static int GCD(int a , int b)
	{
		if(a==0)return b;
		else if(b==0)return a;

		return GCD(b,a%b);
	}
		public static int solution(int a , int b ,int n)
		{
			int count =0;
			int left=0;
			int gcd=0,A=0;
			while(n!=0)
			{
				
				gcd=GCD(a,n);
				
				n = n-gcd;
				
				
				
				A=GCD(b,n);
				if(n==A)count++;
				if(n==0)break;
				n=n-A;
			}
			
return count;	
		}
}
