package Main;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
//575 - Skew Binary uva

public class UVA_575 {
	public static void main(String[] args)
	{
	
		Scanner sc  = new Scanner(System.in);
		 BigInteger bg;
	

	      while(sc.hasNext()) // End of file '.'
	      {
	    	  bg=new BigInteger(sc.nextLine());
	    	  char[] ch = bg.toString().toCharArray();
	    	  String s="";
				 s+=ch[0];int y = Integer.parseInt(s);if(y==0)break;
	skew_bin(bg);
	      }
	     
	}
	public static void skew_bin(BigInteger skew)
	{
		
		
		int t =1; char[] ch = skew.toString().toCharArray();
		long x;long dec=0;
		for(int i = ch.length-1 ; i>=0;i--)
		{
			String s="";
			 s+=ch[i];
			x=Integer.parseInt(s);
			
			dec+=x*(Math.pow(2, t)-1);t++;
			
		}
		System.out.println(dec);
	}
	
}
