package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class TC_482 {

	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	 int[] a = {3,1,4,15,9};
	 System.out.println(average(a));
	     
	     
	}
	
	public static double average(int[] numList)
	{
		
		double avg = 0.0;
		double sum =0;
		for(int i = 0 ; i < numList.length;++i)sum +=numList[i];
		
		avg = (double)sum/numList.length;
		
		
		return avg;
		
	}
}
