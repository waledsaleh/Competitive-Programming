package Main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

//713 - Adding Reversed Numbers uva

public class UVA_713 {

	public static void main(String[] args) throws IOException {

		BufferedInputStream bis = new BufferedInputStream(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	
	
	int test = sc.nextInt();
	String first,sec; String f;StringBuilder s;
	BigInteger re_first,re_sec;StringBuilder sb ;
	StringBuilder sb2 ;
	BigInteger result;
	while(test-->0)
	{
		first=sc.next();sec=sc.next();
		result=BigInteger.ZERO;
		sb=new StringBuilder(first);
		sb2=new StringBuilder(sec);
		
		re_first=new BigInteger(sb.reverse().toString());
		re_sec=new BigInteger(sb2.reverse().toString());
		result=re_first.add(re_sec);
		
		f=String.valueOf(result);
		
		reverse(f);
		
		
		
		
	}
			
			
			
			
		
		
	}
	public static void reverse(String in)
	{
		StringBuilder s =new StringBuilder(in);
		int count=0;
		s.reverse();
		if(s.charAt(0)=='0')
		{
		for(int i = 0 ; i <s.length();i++)
		{
			if(s.charAt(i)=='0')
			{
				count++;
				
			}
		
		}
		s.delete(0, count);
		
		System.out.println(s);
		}
		else
			
			System.out.println(s);
		
	}
	
}
