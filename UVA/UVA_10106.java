package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10106 {

	
public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);

	   while(sc.hasNext())
	   {
		   BigInteger n1 = sc.nextBigInteger();
		   BigInteger n2 = sc.nextBigInteger();
		   System.out.println(n1.multiply(n2));
		   
		   
	   }
	   
}




}
