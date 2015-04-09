package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_603 {
	public static void main (String [] args) throws IOException {
		
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
     Scanner sc  = new Scanner(System.in);
    
     System.out.println(encode("aaaaa"));
}

	public static String encode(String s)
	{
		String res = "";
	StringBuilder sb = new StringBuilder(s);	
	
		while(!sb.toString().equals(""))
		{
			
			if(sb.length()%2==0)
			{
				char ch1 = (char)sb.charAt(sb.length()/2);
				char ch2 = (char)sb.charAt(sb.length()/2-1);
				if(ch1<ch2)
				{
					res +=ch1;
					sb.deleteCharAt(sb.length()/2);
				}
				else if(ch2<ch1||ch1==ch2)
				{
					res +=ch2;
					sb.deleteCharAt(sb.length()/2-1);
				}
				
					
			}
			if(sb.length()%2!=0)
			{
				char ch1 = (char)sb.charAt(sb.length()/2);
				//char ch2 = (char)sb.charAt(sb.length()/2-1);
				res +=ch1;
		         sb.deleteCharAt(sb.length()/2)	;	
			}
			
			
		}
		
		
		return res;
		
	}


}
