package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class CF_339B {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
	
		long n =sc.nextInt(),m=sc.nextInt();
		long c = 1,res=0;
		for(int i = 0 ; i <m ;++i)
		{
			long x = sc.nextInt();
			if(x>=c)res +=x-c;
			else
				res +=n-(c-x);
			c=x;
			
		}
		System.out.println(res);
		
	}
	
	 
}
