package Main;

import java.util.Scanner;

public class CF_478B {

	public static void main(String[] args) {

		
	Scanner sc = new Scanner(System.in);
		
	
	long n  =  sc.nextLong(), m  = sc.nextLong();
		
		
	long min = ( (n%m)*(n/m+1)*(n/m) >> 1) +( (m-n%m)*(n/m)*(n/m-1) >> 1),
		max = ((n-m+1)*(n-m) >> 1);
	
		System.out.println(min+" "+max);
		
		
	}

}
