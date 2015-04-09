package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10579 {
	public static void main (String [] args) throws IOException {
		
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

     Scanner sc = new Scanner(System.in);
      PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    
     StringBuilder sb = new StringBuilder("");
     
     BigInteger[] f = fib();
     while(sc.hasNextInt())
     {
    	 int n =sc.nextInt();
    	 System.out.println(f[n]);
    	 
     }
     
     
	}
	public static BigInteger[] fib()
	{
		BigInteger[]f = new BigInteger[5001];
		f[0]=BigInteger.valueOf(0);
		f[1]=BigInteger.valueOf(1);
		
		for(int i =2 ; i <=5000;++i)
		f[i]=f[i-1].add(f[i-2]);
		
		return f;
	}
}
