package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_374 {

public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);
	    StringBuilder sb = new StringBuilder("");
	    
	    while(sc.hasNext())
	    {
	    	
	    	BigInteger b = sc.nextBigInteger();
	    	BigInteger p = sc.nextBigInteger();
	    	BigInteger m = sc.nextBigInteger();
	    	
	    	BigInteger res =b.modPow(p, m);
	    	
	    	 System.out.println(res);
	    	
	    	
	    	
	    }
	   // System.out.println(sb);
	    
}


}
