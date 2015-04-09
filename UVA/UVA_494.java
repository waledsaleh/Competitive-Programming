package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//494 - Kindergarten Counting Game

public class UVA_494 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		//Notes , Character is class to check that is it digit or letter and so on
		
			
				while(sc.hasNext())
				{
					  boolean start = false;
			            int count =0;
			           
			            char[] words = sc.nextLine().toCharArray();
			            for (char st : words) {
			                if(Character.isLetter(st))
			                {
			                   if(!start)
			                   {
			                       count++;
			                       start = true;
			                   }
			                }
			                else{
			                     start= false;
			                }
			            }
			            System.out.println(count);
			        }
	


	}

	
}
