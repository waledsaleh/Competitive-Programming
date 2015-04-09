package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10464 {

	
public static void main (String [] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
	    Scanner sc = new Scanner(System.in);
	  
	   
	    int n=Integer.parseInt(br.readLine());
	    while(n-->0)
	    {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	// BigDecimal sum = BigDecimal.ZERO;
	    	  BigDecimal n1 = new BigDecimal(st.nextToken());
	    	  BigDecimal n2 = new BigDecimal(st.nextToken());
	    	  
	    	//  BigInteger check = new BigInteger(n1.add(n2).toString());
	    	  
	    	System.out.println(trail(n1.add(n2)));
	    	  
	    	
	    }
	    
}

public static BigDecimal trail(BigDecimal d)
{
	
	StringBuilder q =new StringBuilder(d.toString());

	int index = q.indexOf(".");
	
	for(int i = q.length()-1;;--i)
	{
		if(i==index+1)break;
		if(q.charAt(i)=='0')
		{
			q.delete(i, i+1);
		}
		else
			break;
		
	}
	return new BigDecimal(q.toString().replaceAll(" ", ""));
	
}


}
