package Main;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class CF_456B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  
	/*	BigInteger n=sc.nextBigInteger();
		if(n.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO))
			System.out.println(4);
		else
			System.out.println(0);
		*/

	
		BigInteger n = sc.nextBigInteger();
		 BigInteger x1 = BigInteger.ONE;
		    BigInteger x2 = new BigInteger("2").modPow(n, new BigInteger("5"));
		    BigInteger x3 = new BigInteger("3").modPow(n, new BigInteger("5"));
		    BigInteger x4 = new BigInteger("4").modPow(n, new BigInteger("5"));
		    BigInteger x5 = x1.add(x2).add(x3).add(x4);
		    System.out.println((x5.mod(new BigInteger("5"))));
		
		    
	}

}
