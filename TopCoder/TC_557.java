package Main;

import java.io.IOException;

import java.util.Scanner;
import java.lang.*;

//SRM 557 DIV 250 

public class TC_557 {

	public static void main(String[] args) throws IOException {

		
		Scanner sc = new Scanner(System.in);
	
		int max = sc.nextInt();
		int[] dps = new int[max];
		int[] hp = new int[max];
		
		for(int i = 0 ; i <max;i++)
		{
			dps[i]=sc.nextInt();
		}
		for(int i = 0 ; i <max;i++)
		{
			hp[i]=sc.nextInt();
		}
		
	
		int t = minHp(dps, hp);
		System.out.println(t);
		
			}
		
		public static  int minHp(int[]dps , int[] hp)
			{
					int sum=0;int total=0;
				
				for(int i = 0 ; i <hp.length;i++)
				{
					sum=0;
					for(int j = i;j<dps.length;j++)
					{
						sum+=dps[j];
						
					}
					
					total+=sum*hp[i];
				}
			
	
				return total;
			}
	}
	
	 



	

