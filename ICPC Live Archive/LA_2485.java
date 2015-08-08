package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LA_2485 {

	public static void main(String[] args) throws IOException {

	Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	 
	 String line ="";
	 while(!(line=br.readLine()).equals("#"))
	 {
		 line = line.toLowerCase();
		 
		 char[] ch ={'a','e','i','o','u'};
		 int [] num = new int[5];
     
		 for(int i = 0 ; i <line.length();++i)
		 {
			 if(line.charAt(i)=='e'||line.charAt(i)=='a'||line.charAt(i)=='i'||
					 line.charAt(i)=='o'||line.charAt(i)=='u')
			 {
				int idx = Arrays.binarySearch(ch, line.charAt(i));
				num[idx]++;
				 
			 }
			 
		 }
		 
		 bubble(ch,num);
		 for(int i = 0; i <5 ;++i)
		 {
			 if(i==0)
			  System.out.print(ch[i]+":"+num[i]);
			 else
				 System.out.print(" "+ch[i]+":"+num[i]);
		 }
		 System.out.println(".");
		 
	 }
	
	
	
	}
	static void bubble(char[]ch,int[]a)
	{
		for(int i = 0; i <ch.length;++i)
		{
			for(int j = i+1;j<a.length;++j)
			{
				if(a[i]<a[j])
				{
					int tmp = a[i];
					a[i]=a[j];
					a[j]=tmp;
					
					char tm = ch[i];
					ch[i]=ch[j];
					ch[j]=tm;
				}
				else if(a[i]==a[j]&&ch[i]>ch[j])
				{
					char tm = ch[i];
					ch[i]=ch[j];
					ch[j]=tm;
					
				}
			}
		}
	}
}