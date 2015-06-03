package Main;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
import java.io.*;
import java.lang.*;
public class TC_158 {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);

	System.out.println(getCycle("ABCD", "ABCD"));
      
  	
	}
	static int getCycle(String initial, String current)
	{
		
		String[] save = {initial,initial.charAt(3)+""+initial.charAt(2)
				+initial.charAt(0)+initial.charAt(1),initial.charAt(1)+""+initial.charAt(0)
				+initial.charAt(3)+initial.charAt(2),initial.charAt(2)+""+initial.charAt(3)
				+initial.charAt(1)+initial.charAt(0)};
	  int ind=Arrays.asList(save).indexOf(current);
	  
		if(ind>=0)return ind+1;
		
		 return -1;
		
	} 
}
