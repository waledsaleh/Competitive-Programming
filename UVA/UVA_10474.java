package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.*;
public class UVA_10474 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb =new StringBuilder("");
		int c =1;
		while(true)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			Hashtable<Integer,Integer>map = new Hashtable<Integer,Integer>();
			
			if(n==0&&m==0)break;
			int[]array = new int[n];
			for(int i = 0 ; i < n ;++i)array[i]=sc.nextInt();
			Arrays.sort(array);
			for(int i = 0 ; i < n ;++i)
			{
				int num  = array[i];
				if(!map.containsKey(num))
				map.put(num, i+1);//array[i]=sc.nextInt();
				
					
			}
			//Arrays.sort(array);
			sb.append("CASE# "+c+":\n");
			while(m-->0)
			{
				int num = sc.nextInt();
			//	int index = bs(array, num);
			
			if(map.containsKey(num)){
				sb.append(num+" found at "+map.get(num)+"\n");
			}
			else
				sb.append(num+" not found\n");
			
				
			}
			c++;
				
		}
		System.out.print(sb);

	}
 
 
}
