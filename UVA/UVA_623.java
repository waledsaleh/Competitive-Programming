package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_623 {

public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);
   
	    while(sc.hasNext())
	    {
	    	int n = sc.nextInt();
	    	
	    	System.out.println(n+"!");
	    	System.out.println(fact(n));
	    	
	    	
	    }
}

public static BigInteger fact ( int n )
{
	BigInteger f = BigInteger.ONE;
	for(int i = 2 ; i <=n;++i)
	f= f.multiply(BigInteger.valueOf(i));
	
	return f;
	
}
}
