package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TC_238 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
         
    
         String[] input={"A",
        		 "B",
        		 "C",
        		 "D",
        		 "E",
        		 "F"};
         System.out.println(getHash(input));
         
	}
	public static int getHash(String[] input)
	{
		int sum =0;
		for(int i = 0 ; i < input.length;++i)
		{
			for(int j = 0 ; j <input[i].length();++j)
			{
				sum +=(input[i].charAt(j)-'A')+i+j;
			}
		}
		return sum;
		
	}
}
