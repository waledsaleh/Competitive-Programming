package Main;

import java.util.Scanner;
//993 - Product of digits uva
public class UVA_993 {

	
	public static void main(String[] args)
	{
	
		Scanner sc  = new Scanner(System.in);
		
		int test = sc.nextInt();int num;
		for(int t = 1;t<=test;t++)
		{
		 num = sc.nextInt();
		
	String s="";
		if(num==1)System.out.println(1);
		
		else
		{
			
		
			
			for(int j =9;j>=2;j--)
			{
		while(num%j==0)
		{
			num/=j;
			s=j+""+s;
			
			
			
			}
		
			}
			if(num==1)System.out.println(s);
			else
				System.out.println(-1);
		}
		
		}
	}
		
		
		
		
	}
	

