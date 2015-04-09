package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_210 {
	public static void main (String [] args) throws IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
          Scanner sc  = new Scanner(System.in);

   System.out.println(toFirstUpperCase("more than  one   space    between     words"));
   
	}
	
	public static String toFirstUpperCase(String title)
	{
		String res = "";
		String t = title;
		if(title.equals(res))return res;
		
		
		
		//title=title.replaceFirst(" ", "");
		
		StringBuilder sb2 = new StringBuilder(title);
		
		int count =0;
		for(int i = 0 ; i < sb2.length();++i)
		{
			if(sb2.charAt(0)==' ') {sb2.deleteCharAt(0);i=0;}
			
			else if(sb2.charAt(i)==' ')
			{
				count++;
				
				 if(count>1)
				{ 
					count=0;
					sb2.deleteCharAt(i);
					i=0;
				}
			}
			else
				count=0;
		//title = title.replaceAll(" ", "");
		
		}
		
		title = sb2.toString();
		String[] split=title.split(" ");
		StringBuilder sb = new StringBuilder("");
		
		boolean f= false;
		char  ch = ' ';
		for(int i = 0 ; i < split.length; ++i)
		{
			//if(split[i].equals(""))continue;
			String word = split[i];
			 sb = new StringBuilder(word);
			 
			 ch = word.charAt(0);
			 
			   sb.deleteCharAt(0);
			   
			   ch=(char) (ch-'a'+'A');
			   res =ch+""+sb.toString();
			   split[i]=res;
		}
		sb = new StringBuilder("");
		for(int i = 0 ; i <split.length;++i)sb.append(split[i]);
		
		for(int i = 0 ; i < t.length();++i)
		{
			if(t.charAt(i)==' ')
			{
				sb.insert(i, ' ');
			}
		}
		res = sb.toString();
		return res;
		
	}
          
}
