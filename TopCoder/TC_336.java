package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_336 {

	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
        Scanner sc  = new Scanner(System.in);

        
        
	}

		public static String translate(String word)
		{
			String res = "";
			String vowel="";
			for(int i = 0  ; i < word.length();++i)
			{
				if(word.charAt(i)=='a'||word.charAt(i)=='o'||word.charAt(i)=='i'||word.charAt(i)=='e'||word.charAt(i)=='u'||
						word.charAt(i)=='A'||word.charAt(i)=='O'||word.charAt(i)=='I'||word.charAt(i)=='E'||word.charAt(i)=='U'	)
				{
				vowel +=word.charAt(i);	
				}
				else
					res +=word.charAt(i);
			}
			
			return res+""+vowel;
			
		}
	
}
