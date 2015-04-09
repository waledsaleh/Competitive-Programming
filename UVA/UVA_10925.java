package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10925 {

public static void main (String [] args) throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	   
	    
	    Scanner sc = new Scanner(System.in);
	   int count =1;
	    while(true)
	    {
	    	BigInteger sum = BigInteger.ZERO;
	    	
	    	int n  = sc.nextInt();
	    	int f = sc.nextInt();
	    	if(n==0&&f==0)break;
	    	BigInteger v ;
	    	for(int i = 0 ;i<n;++i)
	    	{
	    		v = sc.nextBigInteger();
	    		sum = sum.add(v);
	    	}
	    	//Bill #1 costs 16200000000: each friend should pay 5400000000
	    	System.out.printf("Bill #%d costs %d: each friend should pay %d\n\n",count,sum,(sum.divide(BigInteger.valueOf(f))));
	    	count++;
	    }
}


}
