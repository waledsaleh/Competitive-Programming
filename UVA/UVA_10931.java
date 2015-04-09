package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_10931 {

	
	public static void main (String [] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    Scanner sc = new Scanner(System.in);
    
	    while(true)
	    {
	   long n =Long.parseLong(br.readLine());
	    if(n==0)break;
	    
	   String b = Long.toBinaryString(n);
	  // System.out.println(b);
	   int count =0;
	   for(int i = 0  ; i <b.length();++i)
	   {
		   if(b.charAt(i)=='1')count++;
	   }
	   
	   System.out.printf("The parity of %s is %d (mod 2).\n",b,count); 
	    }
	   
	}
    
	
	
}
