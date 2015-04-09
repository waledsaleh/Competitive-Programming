package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TC_227 {
//Div 2
	
	public static void main(String[] args) throws IOException, FileNotFoundException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	}
	public static int simpleDifference(String a, String b)
	{
		int score=0;
		if(a.length()<=b.length())
		{
		for(int i = 0 ; i <a.length();++i)
		{
			if(a.charAt(i)==b.charAt(i))
			score++;
			
		}
		
		
		}
		else
		{
			for(int i = 0 ; i <b.length();++i)
			{
				if(a.charAt(i)==b.charAt(i))
				score++;
				
			}
			
		}
		return score;
		
	}
}
