package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CF_236A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	 String word = sc.next();
     HashSet<Character>set = new HashSet<Character>();
     for(int i = 0 ; i < word.length();++i)set.add(word.charAt(i));
     if((set.size()&1)==0)System.out.println("CHAT WITH HER!");
     else
         System.out.println("IGNORE HIM!");
     
	}
	
}