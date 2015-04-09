package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LA_6360 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	int n;int test=1;
	String word ;String domain;
	while(sc.hasNext())
	{
		
	int sum=0;int count =0;int[]array;
	n =sc.nextInt();//Integer.parseInt(word);
	array = new int[n];
	int max =0;
	while(n-->0)
	{
		
	domain =sc.next();//br.readLine();
	 sum=0;
	for(int i = 0 ; i <domain.length();++i)sum+=domain.charAt(i);
	
	
	array[count]=sum;
	count++;
	
	for(int i = 0 ; i <array.length;++i)max=Math.max(max, array[i]);
	
	
	
	}
	System.out.println("Case "+test+": "+max);
	test++;
	}
	
	
	
	
	
	}
	
	
	
	
	}
	
	

