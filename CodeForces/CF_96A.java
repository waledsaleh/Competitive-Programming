package Main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//96A-Codeforces

public class CF_96A {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
		BufferedInputStream bis = new BufferedInputStream(System.in);
	
		String word = br.readLine();
		
		int count =1;
		boolean t = false;
		
		for(int i =1 ; i <word.length();++i)
		{
			if(word.charAt(i)==word.charAt(i-1))
			{
				count++;
				
				
				
			}
			else if(word.charAt(i)!=word.charAt(i-1))
			{
				count=1;
			}
			 if(count>=7)
			{
				t=true;break;
			}
			
		}
		if(t)
		System.out.println("YES");
		else
			System.out.println("NO");
	}

}
