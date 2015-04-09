package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class TCO_1B_2014_200 {
	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	  
	     
	  
	}
	public static String spamCheck(String judgeLog, int good, int bad)
	{
		int goal=0;
		for(int i = 0 ; i < judgeLog.length();++i)
		{
			
			 if(judgeLog.charAt(i)=='o')goal +=good;
			else if(judgeLog.charAt(i)=='x')goal -=bad;
			if(goal<0)return "SPAM";
			
		}
		return "NOT SPAM";
	}
}
