package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
//10327 - Flip Sort uva

public class UVA_10327 {
	
	static final double  pi= 3.14159;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	Reader.init(System.in);
	
	 Locale.setDefault(Locale.US);
	 int n ; int[]array;
	 
	 while(sc.hasNext())
	 {
	  n = sc.nextInt();
	  array = new int[n];
	
	for(int i = 0 ; i <array.length;i++)
	{
		array[i]=sc.nextInt();
	}
	
	//e.mergeSort(array);
	
	 bubble_sort(array);
	
	 
	}
	 
	 
	}
	public static void bubble_sort(int[]array)
	{
		int count=0;
		for(int i = 0 ; i <array.length;i++)
		{
			for(int j = i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					
					count++;
				}
			}
		}
		System.out.println("Minimum exchange operations : "+count);
		
	}
}

