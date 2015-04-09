package Main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TC_572 {

	public static void main(String[] args) {
 
	 Scanner sc = new Scanner(System.in);
	
	 System.out.println(determineSign(new int[]	

			 {-5, 7, 2}));
	}
	static String determineSign(int[] A)
	{
		BigInteger bg = BigInteger.ONE;
		for(int i = 0 ; i < A.length;++i)bg =bg.multiply(BigInteger.valueOf(A[i]));
		if(bg.compareTo(BigInteger.ZERO)<0)return "NEGATIVE";
		if(bg.compareTo(BigInteger.ZERO)==0)return "ZERO";
		return "POSITIVE";
		
	}
}
