package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_568 {

	public static void main (String [] args) throws IOException {
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb;
		    while(sc.hasNext())
		    {
		    	
		    	int n =sc.nextInt();// Integer.parseInt(st.nextToken());
		    	sb= new StringBuilder("");
		    	BigInteger f = fact(n);
		    	
		    	String q = f.toString();
		    	q =q.replaceAll("0", "");
		    	
		    	String num = String.valueOf(n);
		    	
		    	for(int i = 1 ; i <=5-num.length();++i)sb.insert(0, ' ');
		    	
		    	sb.append(n+" -> "+q.charAt(q.length()-1)+"\n");
		    	
		    	System.out.print(sb);
		    	
		    }
		
	}
	public static BigInteger fact(int n)
	{
		BigInteger f = BigInteger.ONE;
		
		for(int i =2 ; i <=n;++i)
		f = f.multiply(BigInteger.valueOf(i));
		
		return f;
		
	}
	/*public static String res (String q)
	{
		
		
		
	}*/
}
