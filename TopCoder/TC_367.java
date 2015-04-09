package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_367 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	
	
	}
	public static int countOccupied(String[] s)
	{
	int count =0;
	for(int i = 0 ; i <s.length;++i)
	{
		
		for(int j = 1 ; j <s[i].length();j+=2)
		{
			if(s[i].charAt(j)=='F'&&s[i].charAt(j-1)=='F')
			count++;
			
		}
		
		
	}
return count;


	}

	
}
