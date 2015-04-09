package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class CF_49A {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String line = br.readLine();
		line = line.replaceAll(" ", "");
	 line = line.replaceAll("[\\d?]", "");
	  if(line.charAt(line.length()-1)=='a'||line.charAt(line.length()-1)=='e'||line.charAt(line.length()-1)=='i'||
			  line.charAt(line.length()-1)=='A'||line.charAt(line.length()-1)=='o'||line.charAt(line.length()-1)=='u'||
			  line.charAt(line.length()-1)=='E'||line.charAt(line.length()-1)=='O'||line.charAt(line.length()-1)=='y'||
			  line.charAt(line.length()-1)=='I'||line.charAt(line.length()-1)=='U'||line.charAt(line.length()-1)=='Y'
			  )
	  {
		  System.out.println("YES");
	  }
	  else
		  System.out.println("NO");
	}

}
