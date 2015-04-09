package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TC_506 {
	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	 
	    
	}
	
	public static int train(int[] attributes)
	{
		int max = 0;
		int count =0;
		Arrays.sort(attributes);
		max = attributes[attributes.length-1];
		
				for(int i = 0 ; i < attributes.length;++i)count +=max-attributes[i];
		
		return count;
		
	}
}
