package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_495 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);
               PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
              int n;
              StringBuilder sb = new StringBuilder("");
              BigInteger[] f = fib();
              
              while(sc.hasNextInt())
              {
            	//StringTokenizer st = new StringTokenizer(n); 
            	n = sc.nextInt();
            	
            	//The Fibonacci number for 5 is 5
            	out.print("The Fibonacci number for "+n+" is "+f[n]+"\n");
            	  
            	  
              }
              out.flush();
              out.close();
              //System.out.print(sb);
              
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
