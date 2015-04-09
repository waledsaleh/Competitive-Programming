package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.io.*;
public class TC_445 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	           Scanner sc = new Scanner(System.in);
	   
	     
	           
	     System.out.println(encrypt("hello"));
	    
	          
	}
	public static String encrypt(String message)
	{
		 HashMap<Character, Character> map = new HashMap<Character, Character>();

		 String res = "";
		 
		 char ch = 'a';
		 for(int i = 0 ; i <message.length();++i)
		 {
		           Character f = map.get(message.charAt(i));	 
			 if(f!=null)
			 {
				 res +=f;
			 }
			 else
			 {
				 map.put(message.charAt(i), ch);
				 res +=ch;
				 ch++;
			 }
		 }
	    return res;
	}
	
}
