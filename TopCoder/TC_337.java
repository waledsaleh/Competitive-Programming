package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_337 {
	public static void main(String[] args) throws IOException, Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	
	System.out.println(minChanges("c"));
	
	}
	
	static String minChanges(String s)
	{
		char[]ch = s.toCharArray();
		
		//if(plain(s))return s;
		
		for(int i = 0 ; i < ch.length/2;++i)
		{
			if(ch[i] != ch[ch.length-1-i])
			{
				if(ch[i]>ch[ch.length-1-i])
				{
					ch[i]=' ';
					
					ch[i]=ch[ch.length-1-i];
				}
				else if(ch[i]<ch[ch.length-1-i])
				{
					
					ch[ch.length-1-i]= ch[i];
				}
			}
			
			
		}
		String res="";
		for(int i = 0 ; i < ch.length;++i)res +=ch[i];
		
		return res;
		
	}
	
}
