package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CF_340A{

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		int x = sc.nextInt();
		int y  = sc.nextInt();
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
System.out.println(res(b,x,y)-res(a-1,x,y));
		
	}
	static int gcd(int x , int y)
	{
		if(y==0)return x;
		return gcd(y,x%y);
		
	}
	static int res(int n ,int x , int y)
	{
		
		int gcd=gcd(x,y);
		long lcm =(long)x*y/gcd;
		return (int) (n/lcm);
	}
}
