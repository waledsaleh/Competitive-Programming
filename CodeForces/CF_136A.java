package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Locale;
import java.util.Scanner;


public class CF_136A {
	public static void main(String[] args) throws IOException {
		//Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	int n =sc.nextInt();
	int[] array = new int[n];
	for(int i = 0 ; i <n;++i)array[i]=sc.nextInt();
	
	for(int i = 1 ; i <=n;++i)
	{
		for(int j =0;j<n;++j)
		{
			
			if(array[j]==i)
			System.out.print(j+1+" ");
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	}
	
	
}
