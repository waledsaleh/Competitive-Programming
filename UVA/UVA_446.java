package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_446 {

	public static void main (String [] args) throws IOException {
		
	  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

 // System.out.println("0000000000011".length());
        
              Scanner sc = new Scanner(System.in);

              int n=Integer.parseInt(br.readLine());
              while(n-->0)
              {
            	  StringTokenizer st = new StringTokenizer(br.readLine());
            	  
            	  String first = st.nextToken();
            	  String mid = st.nextToken();
            	  String last = st.nextToken();
            	  
            	  BigInteger First = new BigInteger(first,16);
            	  
            	  String F = First.toString(2);
            	  
 BigInteger Last = new BigInteger(last,16);
            	  
            	  String L = Last.toString(2);
            	  
            	  String N1 = First.toString(10);
            	  
            	  String N2 = Last.toString(10);
            	  
            	  BigInteger S1 = new BigInteger(N1);
            	  BigInteger S2 = new BigInteger(N2);
            	  
            	  if(mid.charAt(0)=='+')
            	  
            	  System.out.println(zero(F)+" + "+zero(L)+" = "+(S1.add(S2)));
            	  
            	  else if(mid.charAt(0)=='-')
            	  {
            		  if(S1.compareTo(S2)>0)
            		  System.out.println(zero(F)+" - "+zero(L)+" = "+(S1.subtract(S2)));
            		  
            		  else
            			  System.out.println(zero(F)+" - "+zero(L)+" = "+(S1.subtract(S2).multiply(BigInteger.valueOf(-1))));
            		  
            	  }
            	  
            	  
              }


	}
	
	public static String zero(String n)
	{
		StringBuilder s = new StringBuilder(n);
		
		int len = 13-s.length();
			
			for(int i = 0 ; i <len;++i)
			{
				s.insert(0, '0');
				
			}
			
		
		return s.toString();
	}
	
}
