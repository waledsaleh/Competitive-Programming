package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


//10699 - Count the factors uva

public class UVA_10699 {
	public static void main(String[] args) throws IOException {

		
	Scanner sc = new Scanner(System.in);
	while(true)
	{
int n = sc.nextInt();
if(n==0)break;
divis(n);
	

	}
	
	
	}
	
	public static void divis(int n)
	{
		HashSet<Integer>list = new HashSet<Integer>();
		
		StringBuilder sb = new StringBuilder("");
		
		
		sb.append(n+" "+":"+" ");
		int i = 2;
		for( i =2 ; i*i<n;i++)
		{
			if(n%i==0)
			{
				while(n%i==0)
				{
				list.add(i);
				
				n/=i;
				}
			}
			
		}
		if(n>1){
				list.add(n);}
		
	
		sb.append(""+list.size());
		System.out.println(sb);
	}
	}

