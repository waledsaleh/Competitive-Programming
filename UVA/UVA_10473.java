package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10473 {

public static void main (String [] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    Scanner sc = new Scanner(System.in);
	 StringBuilder sb = new StringBuilder("");
	 
	    while(true)
	    {
	    	String number = sc.next();
	    	if(number.charAt(0)=='-')break;
	    	boolean f= false;
	    	
	    	for(int i = 0 ;i < number.length();++i)
	    	{
	    		if(number.charAt(i)>='0'&&number.charAt(i)<='9')
	    		{
	    			f=true;
	    		}
	    		else
	    		{
	    			f= false;
	    			break;
	    		}
	    		
	    	}
	    	
	    	if(f)
	    	{
	    
	    		BigInteger bg = new BigInteger(number,10);
	    		
	    		String res =bg.toString(16).toUpperCase().toString();
	    		
	    		res = "0x"+res;
	    		
	    		System.out.println(res);
	    	}
	    	else
	    	{
	    		String hex = "";
	    		for(int i =2 ; i<number.length();++i)
	    		{
	    			hex +=number.charAt(i);
	    			
	    		}
	    		
BigInteger bg = new BigInteger(hex,16);
	    		
	    		String res =bg.toString(10).toUpperCase().toString();
	    		
	    		//sb.insert(0, "0);
	    		
	    		System.out.println(res);
	    	}
	    	//System.out.print(sb);
	    	
	    }
	    
}


}
