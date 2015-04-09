package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//344A - Magnets
public class CF_344A {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	 
	
	int n = sc.nextInt();
	int[] array = new int[n];
	int count =1;
	int countsec=0;
	for(int i = 0 ; i <n;i++)
	{
		array[i]=sc.nextInt();
		
	}
	
	
	List<Integer>l = new ArrayList<Integer>();
	
	for(int i = 1 ; i <array.length;i++)
	{
		if(array[i]==array[i-1])
		{
			
			if(count>1)
			{
				continue;
			}
			else
				count=1;
		}
		else
			count++;
	}
	
	
	System.out.println(count);
	
	}
	



}