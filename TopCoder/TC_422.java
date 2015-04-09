package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class TC_422 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);
      
             System.out.println(check(1111110));
		
              
	}
public static String check(int number)
	{
		if(number>=1&&number<=10)return "NO";
		// int number = sc.nextInt();
              String N = String.valueOf(number);
				int len = N.length();
				
				int n = len-1;
				while(n!=0)
				{
					String first = N.substring(0,n);
					
					int sum1 = sum1(first);
					
					String sec = N.substring(n,len);
					
					int sum2 = sum1(sec);
					if(sum1==sum2)return "YES";
					n--;
				}
		return "NO";
	}
public static int sum1(String n)
{
	if(n.charAt(0)=='0'){
	n =new StringBuilder(n).reverse().toString();
	}
	
	int number = Integer.parseInt(n);
	int rem=0,sum=1;
	if(number==0)return 0;
	while(number!=0)
	{
		rem = number%10;
		sum *=rem;
		number /=10;
		
		
	}
	
	return sum;
}
}
