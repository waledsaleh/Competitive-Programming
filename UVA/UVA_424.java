package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_424 {

public static void main (String [] args) throws IOException {
		
	BigInteger sum=BigInteger.ZERO;
	Scanner sc = new Scanner(System.in);
	while(true)
	{
		BigInteger bg = sc.nextBigInteger();
		if(bg.toString().equals("0"))break;
		sum = sum.add(bg);
		
	}
	System.out.println(sum);
}


}
