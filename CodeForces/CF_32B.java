package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class CF_32B {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		Scanner sc = new Scanner(System.in);
		
		String bronze = sc.next();
		bronze = bronze.replaceAll("--", "2");
		bronze = bronze.replaceAll("-.", "1");
	
		String res ="";
		for(int i = 0 ;  i <bronze.length();++i)
		{
			if(bronze.charAt(i)=='.')res+="0";
			else
				res +=bronze.charAt(i);
			
		}
		System.out.println(res);
	}
	
	 
  
}
