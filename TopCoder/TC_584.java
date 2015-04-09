package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TC_584 {
	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	 
	     System.out.println(possibleHandles("cb","cd"));
	     
	}
	
	public static int possibleHandles(String familyName, String givenName)
	{
		Set<String>set = new HashSet<String>();
		
		String sub1 = "";
		String sub2="";
		for(int i = 1 ; i <= familyName.length();++i)
		{
		sub1 = familyName.substring(0,i);
			for(int j = 1 ; j <= givenName.length();++j)
			{
				sub2 =givenName.substring(0,j);    // c+""+givenName.charAt(j);
				set.add(sub1+""+sub2);
			}
			
		}
		return set.size();
	}
}
