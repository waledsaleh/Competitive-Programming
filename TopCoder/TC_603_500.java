package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class TC_603_500{
	public static void main (String [] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	    
	     int[] a ={1000000,1000000};
	     System.out.println(makepairs(a,-5));
	}
	
	public static int makepairs(int[] A, int X)
	{
		int count =0;
		Arrays.sort(A);
		for(int i = 0 ; i < A.length;i+=2)if((long)A[i]*A[i+1]>=X)count++;
		
		return count;
	}
}
