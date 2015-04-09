package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_542 {

	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
   Scanner sc  = new Scanner(System.in);
	
  String[] q = 	{ "013040", 
		  "100010", 
		  "300060", 
		  "000008", 
		  "416000", 
		  "000800" };
  
 System.out.println(getEfficiency(q));
 
 
	}
	public static double getEfficiency(String[] profit)
	{
		double pro = 0.0;
		int count =0;
		//String rappit= "";
		
		for(int i = 0 ; i < profit.length;++i)
		{
			
			for(int j = i+1 ; j <profit.length;++j )
			{
				
					pro += profit[i].charAt(j)-'0';
					count++;
				
			}
			
			
		}
		
		
		
		
		
		return (double)pro/count;
	}
}
