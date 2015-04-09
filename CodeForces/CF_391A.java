package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_391A {
	
	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int count =1;
	
	String word = br.readLine();
	
	int c = 0;
	
	for(int i =1 ; i <word.length();++i)
	{
		
		if(word.charAt(i)==word.charAt(i-1))
		{
		
			count ++;
		
		}
		  
		else
			{
			
			if(count %2==0)
			{
			c++;
			
			}
			count =1;
			}
	}
	if(count %2==0)
	{
	c++;
	count =1;
	}
	System.out.println(c);


	//System.out.println(count);
	
	
	}

}
