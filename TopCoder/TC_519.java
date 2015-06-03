package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class TC_519 {
	public static void main (String [] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 
		String[] q ={"Sunday", "Friday", "Tuesday", "Wednesday", "Monday", "Saturday"};
		System.out.println(getDay(q));
		 
	}
	
	public static String getDay(String[]days)
	{
	
		String[] s={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		String res ="";
		for(int i = 0 ; i <s.length;++i)
		{

			if(!linear(days,s[i]))
			{
				
				res= s[i];
				break;
			}
			
		}
		
		return res;
	}
	public static boolean linear(String[]days,String key)
	{
		
		for(int i = 0 ; i<days.length;++i)
		{
			if(days[i].equals(key))
			{
				return true;
			}
			
		}
		
		return false;
		
	}
}
