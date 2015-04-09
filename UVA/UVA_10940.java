package Main;

import java.util.Scanner;

public class UVA_10940 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			
		int n = sc.nextInt();
		if(n==0)break;
		
		if(n<=2)System.out.println(n);
		else
		{
		double p=Math.pow(2,(int)(Math.log(n)/Math.log(2.0)));
  
		if(p==n) System.out.println(n) ;
		else
			System.out.println((int)2*(int)(n-p));
		}
		
		}
		
	}

}
