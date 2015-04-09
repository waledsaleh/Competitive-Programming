package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//250

public class TC_607 {

	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	}
	
	public static int smallestArea(int[] x,int[]y)
	{
		int count =0;
		
		Arrays.sort(x);
		Arrays.sort(y);
		count = (x[x.length-1]-x[0] )*(y[y.length-1]-y[0]);
		
		return count;
		
	}
}
