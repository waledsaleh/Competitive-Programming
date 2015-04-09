package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class CF_22A {

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i = 0 ; i < n ;++i)array[i]=sc.nextInt();
	
		Arrays.sort(array);
		int max = array[0];
		boolean f =false;
	   for(int i = 1 ; i < n;++i)
	   {
		   if(array[i]>max)
		   {
			   max = array[i];
			   f=true;
			   break;
		   }
	   }
	   if(f)
		  System.out.println(max); 
	   else
		   System.out.println("NO");
		
		
	}

}
