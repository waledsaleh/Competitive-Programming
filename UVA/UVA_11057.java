package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.Scanner;

//11057 - Exact Sum UVA

public class UVA_11057 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	
	
	while(sc.hasNextInt())// has_next_int == EOF (.)
	{
	int n = sc.nextInt();
	int[] array = new int[n];
	
	for(int i = 0 ; i <array.length;i++)
	{
		array[i]=sc.nextInt();
	}

	
	int money=sc.nextInt();
	
	work(array,n,money);
	
	}
	

	
	
	
	
	}
	public static void work(int[]array,int n,int money)
	{
		
			Arrays.sort(array);
			int x=0,y=0;int res=9999999;
		for(int i = 0;i <array.length-1;i++)
		{
			for(int j = i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==money&&Math.abs(array[i] - array[j]) < res) {
                    y = Math.max(array[i], array[j]);
                    x = Math.min(array[i], array[j]);
				
					
					
				}
				
			}
		}
		
					System.out.printf("Peter should buy books whose prices are %d and %d.\n\n",x,y);
		}
	
		
		
		
	
	
}
