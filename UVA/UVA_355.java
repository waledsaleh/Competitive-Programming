package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_355 {

	
public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);
	    String number="" ;
	    int n =0;//=sc.nextInt();// Integer.parseInt(st.nextToken());
    	int t=0;
	    	
	    while(sc.hasNext())
	    {
	    	 try
	 	    {
	    	 n =sc.nextInt();// Integer.parseInt(st.nextToken());
	    	 t= sc.nextInt();//Integer.parseInt(st.nextToken());
	    	 number = sc.next();//st.nextToken();
	    	
	    	
	    		 BigInteger bg = new BigInteger(number,n);
	    		
	    		 String res = bg.toString(t).toUpperCase();
	    		 
	    System.out.println(number+" base "+n+" = "+res+" base "+t);
	    
	    }
	    catch(NumberFormatException e)
	    {
	    	//126 is an illegal base 5 number
	    	System.out.println(number+" is an illegal base "+n+" number");
	    }
	    	 
	    }
}


}
