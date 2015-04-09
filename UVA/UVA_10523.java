package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10523 {
	
public static void main (String [] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    Scanner sc = new Scanner(System.in);
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	
	    while(sc.hasNext())
	    {
	    	int n = sc.nextInt();
	    	BigInteger a = sc.nextBigInteger();
	    	BigInteger sum =BigInteger.ZERO;
	    	
	    	
	    	for(int i =1 ; i <=n;++i)
	    	{
	    		sum =sum.add((pow(a,i).multiply(BigInteger.valueOf(i))));
	    		
	    	}
	    	System.out.println(sum);
	    }
	
}
public static BigInteger pow(BigInteger a, int n)
{
	if(n==0)return BigInteger.ONE;
	if(n==1)return a;
	BigInteger t = pow(a,n/2);
	
	return t.multiply(t).multiply(pow(a,n%2));
}

}
