package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

//10023 - Square root  uva

public class UVA_10023 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int test = sc.nextInt();
	while(test-->0)
	{
		
BigInteger y = sc.nextBigInteger();

BigInteger x = bigsqrt(y);
System.out.println(x);

	}
	}
	static BigInteger bigsqrt(BigInteger A) // fast algorithm to compute square root
	{
	    boolean didWork ;
	    BigInteger temp = A.shiftRight(BigInteger.valueOf(A.bitLength()).shiftRight(1).intValue()), result = null;
	    while (true)
	    {
	        result = temp.add(A.divide(temp)).shiftRight(1);
	        if (!temp.equals(result))
	            temp = result;
	        else
	            break ;
	    }
	    didWork = false ;
	    if (result.multiply(result).equals(A))
	        didWork = true ;
	   
	    return result;
	} 

}
