package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class TC_160 {
	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
      Scanner sc  = new Scanner(System.in);
	
    System.out.println(getValue("TRADINGFEW","LGXWEV"));
      
	}
	
	public static int getValue(String key, String code)
	{
		String res = "";
		for(int i = 0 ; i <code.length();++i)
		{
		
			int index = key.indexOf(code.charAt(i));
			if(index==-1)continue;
			if(index >-1)
			{
				if(index ==key.length()-1)res +='0';
				else
					res +=(index+1);
				
			}
			
		}
		
		return Integer.parseInt(res);
		
		
	}
}
