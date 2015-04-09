package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10235 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
        Scanner sc = new Scanner(System.in);
        
           while(sc.hasNext())
           {
        	   int n = sc.nextInt();
        	   
        	   if(prime(n))
        	   {
        		   String q = new StringBuilder(String.valueOf(n)).reverse().toString();
        		   
        		   if(!q.equals(String.valueOf(n)))
        				   {
        			   
        			   if(prime(Integer.parseInt(q)))
        			   {
        			     System.out.println(n+" "+"is "+"emirp.");       
        			   }
        			   
        			    else
        			   System.out.println(n+" "+"is "+"prime."); 
        				   }
        		   else
        			   System.out.println(n+" "+"is "+"prime."); 
        		  
        	   }
        	   else
        		   System.out.println(n+" "+"is not prime.");
        	   
           }
              
	}
	
	public static boolean prime(int n )
	{
		
		for(int i =2 ; i*i <=n;++i)
		{
			if(n%i==0)return false;
			
		}
		return true;
	}
	
}
