package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class TC_315_500 {

	public static void main (String [] args) throws IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		     Scanner sc  = new Scanner(System.in);
		     
		     System.out.println(lastDigit(9999999));
	  
	}
	public static int lastDigit(int n)
	{
		int rem=0,sum=0;
		while(true)
		{
			while(n!=0)
			{
				rem = n%10;
				sum+=rem;
				n /=10;
				
			}
			if(sum >=0&&sum<=9)return sum;
			
			else
				n = sum;
			sum=0;
		}
		//Another solution
		
		 /*
		  * if(n<10)return n;
		    if(n%9==0)return 9;
		    return n%9;
		
		
		*/
		
	}
	
}
