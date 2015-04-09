package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class LA_4104 {

	public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);
	    
	    int c = sc.nextInt();
	    while(c-->0)
	    {
	    BigInteger x =sc.nextBigInteger();
	   BigInteger y = sc.nextBigInteger();
	    BigInteger n = sc.nextBigInteger();
	    
	    
	   
	    		System.out.println( x.modPow(y, n));
	    		
	    		
	    }
	    
	}
	
}
