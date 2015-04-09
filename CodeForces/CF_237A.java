package Main;

import java.util.HashMap;
import java.util.Scanner;

public class CF_237A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =1;
	int[] a = new int[100010];
		while(n-->0)
		{
			int f =sc.nextInt(),s=sc.nextInt();
			int r = f*62+s;
		     a[r]++;
		   
			count = Math.max(count, a[r]);
			
		}
		System.out.println(count);
		
		
	}

}
