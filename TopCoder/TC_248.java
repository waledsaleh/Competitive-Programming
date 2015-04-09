package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_248 {
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
	System.out.println(countSyllables(	

			"BOOKKEEEEEEEEEEEEPER"));
		 
		
	}
	static int countSyllables(String word)
	{
		boolean check = false;
		int count =0;
		for(int i = 0 ; i < word.length();++i)
		{
			if(word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='U'
					||word.charAt(i)=='O'||word.charAt(i)=='I')
			{
				if(!check)
				{
					check = true;
					count++;
				}
				
			}
			else
				check=false;
		}
		
		return count;
		
		/*
		 * String s = word.replaceAll("[AEIOU]+", "A ");
		s = s.replaceAll("[^AEIOU\\s]+", "");
		
		return s.trim().split("\\s+").length;
		 */
	}
}
