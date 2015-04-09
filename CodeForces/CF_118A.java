package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_118A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	StringBuilder sb ;
	
	String word = br.readLine();
	
	String w = word.toLowerCase();
	String res="";
	sb=new StringBuilder(w);
	if(sb.charAt(0)=='a'||
			sb.charAt(0)=='u'||
			sb.charAt(0)=='o'||
			sb.charAt(0)=='i'||
			sb.charAt(0)=='e'||
			sb.charAt(0)=='y')
	{
		sb.deleteCharAt(0);
		
	}
	
	
	for(int i = 0 ; i <sb.length();++i)
	{
		
		if(sb.charAt(i)=='a'||
				sb.charAt(i)=='u'||
				sb.charAt(i)=='o'||
				sb.charAt(i)=='i'||
				sb.charAt(i)=='e'||
				sb.charAt(i)=='y')
		{
			sb.deleteCharAt(i);
			
			if(i>0)
				i--;
			
		}
		
			
	}
	if(sb.charAt(0)=='a'||
			sb.charAt(0)=='u'||
			sb.charAt(0)=='o'||
			sb.charAt(0)=='i'||
			sb.charAt(0)=='e'||
			sb.charAt(0)=='y')
	{
		sb.deleteCharAt(0);
		
	}
	
	
	
	//System.out.println(sb);
	char f=' ';
	
	for(int i = 0 ; i <sb.length();++i)
	{
		f=sb.charAt(i);
		res +="."+f; 
		
		
	}
	System.out.println(res);
	
	}
	
	
	
	
}
