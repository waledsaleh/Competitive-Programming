package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TC_608 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String e = "RRLRRLLR";
	System.out.println(finalPosition(e,10,10));
	
	
	}
	
	public static  int finalPosition(String commands, int A, int B) 
	
	{
	    int count =0;
	  
	   
	    StringBuilder sb = new StringBuilder(commands);
		
	    
		for(int i = 0 ; i <sb.length();++i)
		{
			if(sb.charAt(i)=='R'&&count<B)
			{
				
				
					count++;
				
			}
			if(sb.charAt(i)=='L'&&count>-A)
			{
				
				
					
					count--;
				
			}
		}
		return count;
	}
	
	
}
