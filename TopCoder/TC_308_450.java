package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class TC_308_450 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
	
	 System.out.println(decode("101101",new String[]{"00","10","01","11"}));
			 
	
	}
	static String decode(String archive, String[] dictionary)
	{
		String res ="";
		
		for(int i = 0 ; i < archive.length();)
		{
			String sub ="";
			for(int j = i+1 ; j <= archive.length();++j)
			{
				sub = archive.substring(i,j);
				int index=linear(dictionary,sub);
				if(index >-1)
				{
					res +=(char)(index +'A');
					i=j;
					break;
				}
				
			}
			
		}
		return res;
	}
	public static int linear (String[] dictionary,String key)
	{
		for(int i = 0 ; i < dictionary.length;++i)
		{
			if(dictionary[i].equals(key))return i;
		}
	return -1;
		
	}
}
