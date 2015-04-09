package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class UVA_455 {
   
	static HashSet<String>set=new HashSet<String>();
	public static void main(String[] args) throws IOException {

	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
	 StringBuilder sb = new StringBuilder("");
   
	 Scanner sc = new Scanner(System.in);
	 
     int test = sc.nextInt();
     for (int i = 0; i < test; i++) 
     {
         String word = sc.next();
         int len = 1;
         if (i != 0)
             System.out.println();
         for (int j = 1; j < word.length(); j++) {
             while (word.charAt(j) != word.charAt(j % len)) {
                 len++;
             }
         }
         if (word.length() % len == 0)
             System.out.println(len);
         else
             System.out.println(word.length());
         
         
     }
	 
	 
	}
	
}
		
