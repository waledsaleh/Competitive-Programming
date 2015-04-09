package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10551 {

public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);

	    while(true)
	    {
	    	int b = sc.nextInt();
	    	if(b==0)break;
	    	
	    	String y = sc.next();
	    	
	    	
	    	BigInteger p =new BigInteger(y, b);
	    	
	    	String sec = sc.next();
	    	
	    	BigInteger m  =new BigInteger(sec,b);
	    	//System.out.println(p);
	    	
	    	
	    	System.out.println(p.mod(m).toString(b)); // output can be any base radix 
	    	
	    	
	    	
	    }
}


}
