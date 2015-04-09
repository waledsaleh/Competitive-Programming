package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10323 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);

              while(sc.hasNext())
              {
            	  long n = sc.nextLong();
            	  if(n>13)
            	  {
            		  System.out.println("Overflow!");
            	  }
            	  else if(n>0&&n<8)
            	  {
            		  System.out.println("Underflow!");
            	  }
            	  else if(n>=8&&n<=13)
            		  System.out.println(fact(n));
            	  
            	  else if(n<=0)
            	  {
            		  if((n&1)==0)System.out.println("Underflow!");
            		  else
            			  System.out.println("Overflow!");
            	  }
              }
	}
	public static BigInteger fact (long n)
	{
		BigInteger f = BigInteger.ONE;
		for(long i = 2 ; i <=n;++i)
		{
			f=f.multiply(BigInteger.valueOf(i));
			
		}
		
		
		return f;
	}
}
