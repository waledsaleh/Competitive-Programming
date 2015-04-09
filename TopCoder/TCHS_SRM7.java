package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TCHS_SRM7 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
     
         System.out.println(collectLetters("Waled saleh Mohammed"));
         
         
	}
	public static String collectLetters(String text)
	{
		text = text.toLowerCase().replaceAll(" ", "");
		text = text.replaceAll("[0123456789]", "");
//		int[] array = new int[2000];
		String res = "";
            char[]ch =text.toCharArray();
		Arrays.sort(ch);
		for(char j : ch)res +=j;
		
		return res;
		
		
	}
	
}
