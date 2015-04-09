package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_518_500 {

	public static void main(String[] args) throws IOException {
		
		String t = "aquickbrownfoxjumpsoverthelazydog";
		System.out.println(getLargest(t));
	
		
    }
	
     public static String getLargest(String s)
     {
         if(s.equals(""))return s;
    	 
    	 int maxChar = 0;
    	 for(int i =1 ; i <s.length();++i)
    	 {
    		 if(s.charAt(i)>s.charAt(maxChar))maxChar=i;
    	 }
    	 //Relative order must be kept
	      String rem = s.substring(maxChar+1);                            
	      //Recursion on remaing positions for orginal string                                                       
	    return s.charAt(maxChar)+getLargest(rem);                               
     }

}