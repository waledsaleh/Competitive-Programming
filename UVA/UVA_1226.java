package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_1226 {
public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);

	    
	    
	    int test = sc.nextInt();
	    while(test-->0)
	    {
	    	BigInteger n = sc.nextBigInteger();
	    	BigInteger p = sc.nextBigInteger();
	    	
	    	BigInteger res = BigInteger.ZERO;
	    	
	    	String r = String.valueOf(p);
	    	for(int i = 0 ; i <r.length();++i)
	    	{
	    		int q = Integer.parseInt(""+r.charAt(i));
	    		
	    		// Algorithm remainder
	    		res  = (res.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(q))).mod(n);
	    		
	    	}
	    	System.out.println(res);
	    	
	    }
	    
}


}
