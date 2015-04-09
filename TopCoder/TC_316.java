package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TC_316 {
	public static void main (String [] args) throws IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
Scanner sc  = new Scanner(System.in);
System.out.println(getMessage(" "));

	}
	// TC 316
	
	public static String getMessage(String text)
	{
		StringTokenizer st = new StringTokenizer(text);
		String[] s = new String[st.countTokens()];
		for(int i = 0 ; i < s.length;++i)s[i]=st.nextToken();
		
		String res = "";
		for(int i = 0 ; i < s.length;++i)
		{
			res +=s[i].charAt(0);
			
			
		}
		return res;
	}

}
