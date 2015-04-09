package Main;

import java.util.Scanner;

public class CF_200B {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double avg =0;
		for(int i = 0 ; i < n ;++i)
		{
			int N = sc.nextInt();
			avg +=(double)(N/2.0);
		}
		double frac = 2.0/n;
		double d =(double)(avg*frac);
		
		System.out.printf("%.12f",d);		
		
	}

}
