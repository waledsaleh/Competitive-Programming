package Main;

import java.math.BigInteger;
import java.util.Scanner;



public class CF_450B {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(),y=sc.nextInt();
         int n = sc.nextInt();
         
         long M =1000000007;
		
		n%=6;
		if (n==1) {
			System.out.println((x+M)%M);
		} else if (n==2) {
			System.out.println((y+M)%M);
		} else if (n==3) {
			System.out.println((y-x+M+M)%M);
		} else if (n==4) {
			System.out.println((M-x)%M);
		} else if (n==5) {
			System.out.println((M-y)%M);
		} else {
			System.out.println((x-y+M+M)%M);
		}
		
	}
}
