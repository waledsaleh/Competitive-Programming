package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TC_470 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);
      
              int[] x ={7,7,7,7,7,7,7};
              int[] y = {105,1231,5663,295,3062,380,7777};
              System.out.println(findMinimumDistance(x,y));
              
              
	}
	public static int findMinimumDistance(int[] x, int[] y)
	{
		int sum =0;
		Arrays.sort(x);
		Arrays.sort(y);
		for(int i = 1 ; i <x.length;++i)
		{
			int first =Math.abs(x[i-1]-x[i]);
			int sec = Math.abs(y[i-1]-y[i]);
			
			sum +=first+sec;
			
			
		}
		return sum;
		
	}
}
