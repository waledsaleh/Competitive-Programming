package Main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CF_267A {

	public static void main(String[] args) throws Exception {

		Scanner sc= new Scanner(System.in);
		int count =0;
		int n = sc.nextInt();
		while(n-->0)
		{
			int p = sc.nextInt();
			int q  = sc.nextInt();
			if(p!=q && Math.abs(p-q)>=2)count++;
			
		}
		
		System.out.println(count);
		
	}
	
}
