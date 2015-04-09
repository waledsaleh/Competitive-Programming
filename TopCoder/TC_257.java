package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class TC_257 {
       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getValue(	

"TRADINGFEW", "LGXWEV"));
		
	}
	static int getValue(String key, String code)
	{
		String res = "";
		for(int i = 0 ; i < code.length();++i)
		{
			int index = key.indexOf(code.charAt(i));
			
				if(index !=-1)//code.charAt(i))
				{
					if(index==key.length()-1)res +=0;
					
					else
					res +=(index+1);
					
				}
			
		}
		
		return Integer.parseInt(res);
	}
	
	
	}

	
