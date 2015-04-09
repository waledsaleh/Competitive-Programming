package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_1230 {
	
public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);
int test = sc.nextInt();
	    while(test-->0)
	    {
	    	BigInteger x = sc.nextBigInteger();
	    	BigInteger y = sc.nextBigInteger();//sc.nextInt();
	    	BigInteger m = sc.nextBigInteger();
	    	System.out.println(x.modPow(y, m));
	    	
	    }
}

}
