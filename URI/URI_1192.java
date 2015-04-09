package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class URI_1192 {
	public static void main(String[] args) throws IOException {
	Locale.setDefault(Locale.US);
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	R.init(System.in);
	
	int test = Integer.parseInt(br.readLine());
	
	String word ="";int n1=0,n2=0;
	while(test-->0)
	{
		word = br.readLine();
		String first = String.valueOf(word.charAt(0));
		String sec = String.valueOf(word.charAt(2));
		
		n1=Integer.parseInt(first);
		
				n2=Integer.parseInt(sec);
				
		if(Character.isUpperCase(word.charAt(1)))
		{
			if(n1!=n2)
			{
				
				System.out.println(n2-n1);
			}
			else if(n1==n2)
			{
				System.out.println(n1*n2);
				
			}
			
		}
		else if(Character.isLowerCase(word.charAt(1)))
		{
			if(n1!=n2)
			{
				
				System.out.println(n1+n2);
			}
			else if(n1==n2)
			{
				System.out.println(n1*n2);
				
			}
			
		}
		
	}
	
	
	
	}
	

}


