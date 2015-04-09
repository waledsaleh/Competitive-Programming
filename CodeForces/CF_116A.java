package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_116A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int a=0,b=0;
	int res=0;
	int[] array ;
	int test=sc.nextInt();int count=0;
	array = new int[test];
	for(int i =1 ; i <=test;++i)
	{
		a=sc.nextInt();b=sc.nextInt();
		
		
		if(i==1)
		{
		if(a==0)
		{
			res=b;
			
			
		}
		}
		else
		{
		res=Math.abs(res-a);
		res=res+b;
		}
		array[count]=res;
		count++;
		
	}
	int max =0;
	for(int i=0 ; i<array.length;++i )
	{
		if(array[i]>=max)
		{
			max=array[i];
		}
	}
	System.out.println(max);
	}
	
	}
	

