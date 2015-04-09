package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class CF_43B {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String head =br.readLine();
		String text = br.readLine();
	   char[] ch1 = head.toCharArray();
	   char[] ch2 = text.toCharArray();
		int[] array = new int[256];
				for(char c: ch1)
				{
					if(c !=' ')array[c]++;
				}
				for(char c: ch2)
				{
					if(c !=' ')array[c]--;
				}
				for(int j : array){if(j<0){System.out.println("NO");return ;}}
				
				System.out.println("YES");
	}
    
	
	
}
