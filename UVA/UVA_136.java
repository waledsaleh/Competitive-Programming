package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_136 {
  
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		  
		
		System.out.println("The 1500'th ugly number is "+859963392+".");
	     
	//another solution
	    // we can get prime factor for each number and if there are 2 or 3 or 5 factor of this number, so it is u
		// ugly number :)
	      
	}
	static long Max_div(long a ,long b)
	{
		while(a%b==0)a = a/b;
		return a;
	}
	static boolean ugly(long n)
	{
		n = Max_div(n,2);
		n = Max_div(n,3);
		n = Max_div(n,5);
		return (n==1)?true:false;
	}
}