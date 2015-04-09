package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
//A. Fox and Number Game
public class CF_389 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int[] x = new int[n];
	for(int i = 0 ; i <n;++i)x[i]=sc.nextInt();
	int sum =0;
	
	while(true){
		//int[] a =reverse(x);
		//int j = x.length-2;
		Arrays.sort(x);
		boolean b = false;
	for(int i =1 ; i <x.length;++i)
	{
		
			if(x[i]>x[i-1])
			{
				
				//e=x[i];
				x[i]=x[i]-x[i-1];
				b= true;
				
			}
			
	}
	if(!b)break;
	
	
	}
	
	
	
	for(int i = 0 ; i <n;++i)sum+=x[i];
	System.out.println(sum);
	
	
	}

	public static int[] reverse(int[] a)
	{
		int[] array = new int[a.length];
		for(int i  = a.length-1;i>=0;--i)
		{
			array[i]=a[i];
		}
		
		return array;
	}
}
