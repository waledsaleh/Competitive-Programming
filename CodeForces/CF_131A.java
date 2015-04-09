package Main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

// 131 A Caps Lock - code forces

public class CF_131A {
	
	public static void main(String[] args) throws IOException, Exception {
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	
	
	String word = br.readLine();
	String result ="",s="";boolean t =false;
	StringBuilder sb = new StringBuilder();
	char e =' ';
		if(Character.isUpperCase(word.charAt(0)))
				{
			e=word.charAt(0);
			
			for(int j = 1;j<word.length();++j){
				
			if(Character.isUpperCase(word.charAt(j)))
					{
				t= true;
				
				
					}
			else if(Character.isLowerCase(word.charAt(j)))
			{
				t = false;
				break;
			}
			
			}
			
			if(t)
			{
				s=word.toLowerCase();
				sb=new StringBuilder(s);
				// result =sb.deleteCharAt(0);
				
				//sb.setCharAt(0, e);
				System.out.println(sb);
			}
			else if(!t)
			{
				
				int count=0;
				for(int i = 0 ; i <word.length();++i)
				{
					count++;
				}
				if(count==1)
				{
					if(Character.isUpperCase(word.charAt(0)))
					{
			System.out.println(word.toLowerCase());
					}
					else
						System.out.println(word.toUpperCase());
				}
				else
					sb=new StringBuilder(word);
					System.out.println(sb);
			}
			
				}
		
		else	if(Character.isLowerCase(word.charAt(0)))
		{
	
	
	for(int j = 1;j<word.length();++j){
		
	if(Character.isUpperCase(word.charAt(j)))
			{
		t= true;
		
		
			}
	else
	{
		t=false;
		break;
	}
	
	}
	
	if(t)
	{
		s=word.toUpperCase();
		e=s.charAt(0);
		String w = s.toLowerCase();
		
		sb=new StringBuilder(w);
		
		
		sb.setCharAt(0, e);
		
		System.out.println(sb);
	}
	else if(!t){
		int count =0;
		
		for(int i = 0 ; i <word.length();++i)
		{
			count++;
		}
		if(count==1)
		{
			if(Character.isUpperCase(word.charAt(0)))
			{
	System.out.println(word.toLowerCase());
			}
			else
				System.out.println(word.toUpperCase());
		}
		else
			sb=new StringBuilder(word);
			System.out.println(sb);
	
	
	}
	
		}
		
		
	

	}

}
