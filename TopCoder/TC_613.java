package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class TC_613 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);

              
      System.out.println(getAnswer("XCYAZTX"));
              
	}
	
	public static  String getAnswer(String S)
	{
		
		String q = "";
		char[] s = S.toCharArray();
		
		for(int i = 0; i <s.length;++i)
		{
			if(s[i]=='C'||s[i]=='A'||s[i]=='T')
			{
			 q+=s[i];
			}
		}
		
		
		
		if(q.equals("CAT"))//("CAT"))
		{
			return "Possible";
		}
		return "Impossible";
		
	}
	
	
	
}
