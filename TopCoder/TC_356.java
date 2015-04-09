package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_356 {
	public static void main (String [] args) throws IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		     Scanner sc  = new Scanner(System.in);
	     
		     System.out.println(translate("What is the weather like today?"));
		     
	}
	
	public static String translate(String text)
	{
		//Another solution
		return text.toLowerCase().replaceAll("[.,!?]","").replaceAll("and", "&").replaceAll("at", "@").replaceAll("ate", "").replaceAll("you", "U");
		
		/*
		text = text.toLowerCase();
		text = text.replaceAll("[.,?]", "");
		String[] s ={"and","ate","you","at"};
		
		String q = "";
		
		for(int i = 0 ; i < s.length;++i)
		{
			q= s[i];
			text = ret(q,text);
		}
		
		return text;
		*/
	}
	/*
	public static String ret(String q,String text)
	{
		
		Pattern pattern = Pattern.compile(q);
		Matcher matcher = pattern.matcher(text);
			while(matcher.find())
			{
				if(q.equals("and"))text = matcher.replaceAll("&");
				
				else if(q.equals("ate"))
					text = matcher.replaceAll("8");
				else if(q.equals("you"))
					text = matcher.replaceAll("U");
				else if(q.equals("at"))
				{
					
					text = matcher.replaceAll("@");
				}
			}
			return text;
	}*/
}
