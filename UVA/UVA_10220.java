package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UVA_10220 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);

   
    while(sc.hasNext())
    {
    	long n = sc.nextLong();
    	
    	System.out.println(fact(n));
    	
    	
    }
              
	}
	public static BigInteger fact (long n)
	{
		BigInteger f = BigInteger.ONE;
		for(long i = 2 ; i <=n;++i)
		{
			f=f.multiply(BigInteger.valueOf(i));
			
		}
		String q = f.toString();
		q = q.replaceAll("0", "");
		
		BigInteger rem = BigInteger.ZERO;
		BigInteger sum = BigInteger.ZERO;
		
		f = new BigInteger(q);
		while(f.compareTo(BigInteger.ZERO)!=0)
		{
			rem = f.remainder(BigInteger.valueOf(10));
			sum = sum.add(rem);
			f = f.divide(BigInteger.valueOf(10));
			
		}
		
		return sum;
	}
	
}