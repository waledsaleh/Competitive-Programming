package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_236 {
	public static void main (String [] args) throws IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
  Scanner sc  = new Scanner(System.in);

  System.out.println(getLargest("999^1000","1000^999"));
  
  
	}
	public static String getLargest(String numberA, String numberB)
	{
		String[] s = numberA.split("[\\^]");
		String[] p = numberB.split("[\\^]");
		
		long pow_n1=Long.parseLong(s[0]);
		long pow_n2=Long.parseLong(p[0]);
		
		long n1 = Long.parseLong(s[1]);
		long n2 = Long.parseLong(p[1]);
		
		if(n1*Math.log(pow_n1)>n2*Math.log(pow_n2))
		{
			return numberA;
		}
		return numberB;
	}

}
