package Main;

import java.util.Arrays;
import java.util.Scanner;

public class SPOJ {

	//sum of digits spoj
	public static void main(String[] args)
	{
	
		Scanner sc  = new Scanner(System.in);

		
		int start ;int end ;
		
		int sum=0,rem=0;int s=0;
		while(sc.hasNext())
		{
			start = sc.nextInt(); end = sc.nextInt();int[] array = new int[end];
			if(start==-1 && end==-1)break;
		for(int i = start ; i<=end;i++)
		{
			
			while(s!=0)
			{
			rem=s%10;
			sum+=rem;
			s/=10;
			}
			
		}
		
		System.out.println(sum);
		}
	}
	
}
