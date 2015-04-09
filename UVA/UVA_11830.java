package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_11830 {

public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		   
	    Scanner sc = new Scanner(System.in);
	    
	   while(true)
	   {
		   int n = sc.nextInt();
		   BigInteger m = sc.nextBigInteger();
		   
		   if(n==0&&m.compareTo(BigInteger.ZERO)==0)break;
		   
		   String q = String.valueOf(m);
		   
		   q = q.replaceAll(String.valueOf(n), "");
		   if(q.equals(""))
		   {
			   System.out.println(0);
			   continue;
		   }
		   boolean f = false;
		   int index = 0;
		   for(int i = q.length()-1 ; i >=0;--i)
		   {
			   if(q.charAt(i)=='0')
			   {
				   f=true;
				   index = i;
				   continue;
			   }
			   else
			   {
				   q = q.replaceAll(String.valueOf(n), "");
				   
			   }
			   
			   
		   }
		   if(f)
		   {
			   System.out.println(q.charAt(index));
		   }
		   else
		   {
			   q= q.replaceAll(String.valueOf(n), "");
			   System.out.println(q);
		   }
		   
	   }
}


}
