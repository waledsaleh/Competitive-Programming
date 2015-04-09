package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class UVA_10924 {

	public static void main (String [] args) throws IOException {
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		String word;
	      while((word=br.readLine())!=null)
	      {
	    	  
	    	 long sum = 0 ;
	    	  for(int i = 0 ; i <word.length();++i)
	    	  {
	    		  if(word.charAt(i)>='a' && word.charAt(i) <='z')
	    		  {
	    			  sum +=(word.charAt(i)-'a')+1;
	    		  }
	    		  else
	    			  sum +=(word.charAt(i)-'A')+27;
	    		  
	    	  }
	    	 // System.out.println(sum);
	    	 if(isprime(sum))
	    	  {
	    		  System.out.println("It is a prime word.");
	    	  }
	    	  else
	    		  System.out.println("It is not a prime word.");
	    	  
	    	  
	      }
		
		
	}
	
	public static boolean isprime(long n)
	{
		//if(n <=1)return false;
		
		for(int i = 2 ; i*i<=n;++i)
		{
			if(n%i==0)return false;
		}
		return true;
	}
	
}
