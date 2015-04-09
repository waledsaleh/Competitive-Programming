package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class TC_278 {

	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	    
	
	     String[] rectangles={"B 1 6", "A 2 3","S 1 1"};
	     System.out.println(maximalIndexed(rectangles));
	  
	  
	     
	}
	static String maximalIndexed(String[] rectangles)
	{
		long[] array = new long[26];
	
	for(int i = 0 ; i < rectangles.length;++i)
	{
String[]split = rectangles[i].split(" ");
		array[split[0].charAt(0)-'A'] += Integer.parseInt(split[1])*Integer.parseInt(split[2]);
	}
	long max =0;
	char ch = 'A';
	for(int i = 0 ; i< array.length;++i)
	{
		if(array[i]>max)
		{
			max = array[i];
			ch = (char)('A'+i);
		}
	}
	return ch+" "+max;
	
	}
}

