package Main;

import java.util.Scanner;

public class CF_486A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n =sc.nextLong();
		
		if((n&1)==0)System.out.println(n/2);
		else
			System.out.println(-(n+1)/2);
			
		
	}

}
