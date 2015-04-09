package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_11879 {

public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);
	    
	    while(true)
	    {
	    	BigInteger n = sc.nextBigInteger();
	    	
	    	if(n.compareTo(BigInteger.ZERO)==0)break;
	    	
	    	if( n.mod(BigInteger.valueOf(17)).compareTo(BigInteger.ZERO)==0)
	    	{
	    		System.out.println(1);
	    	}
	    	else
	    		System.out.println(0);
	    	
	    }
}


}
