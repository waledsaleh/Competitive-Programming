package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//Fly Freebie- code force

public class CF_386B
{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int[] array = new int[n];
	for(int i = 0 ; i <n;++i)array[i]=sc.nextInt();
	
	int t = sc.nextInt();
	Arrays.sort(array);
	int count=0;
	for(int i = 0 ; i <n;i++)
	{
		for(int j =i+1;j<n;j++)
		{
		 if(array[j]-array[i]<=t)
		{
			count=Math.max(j-i, count);
		}
	    
		}
		
	}
	System.out.println(count+1);
	
	
	
	}
}
