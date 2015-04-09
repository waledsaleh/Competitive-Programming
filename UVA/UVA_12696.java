package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_12696 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
		
	int test = sc.nextInt();
	double len,width,dip,wei;
	int sum=0;
	while(test-->0)
	{
		double sumall=0;
		 
		len=sc.nextDouble();
		width=sc.nextDouble();
		dip=sc.nextDouble();
		wei=sc.nextDouble();
		
		sumall=len+width+dip;
		
		if(len <=56.00&&width <=45.00&&dip <=25.00)
		{
			if(sumall<=125.00&&wei<=7.00)
			{
			sum++;
			System.out.println(1);
			}
			else
			System.out.println(0);
		}
		else
		{
			if(sumall<=125.00&&wei<=7.00)
			{
				sum++;
				System.out.println(1);
				
				
			}
		else
			System.out.println(0);
		}
	}
	System.out.println(sum);
	
	}

}
