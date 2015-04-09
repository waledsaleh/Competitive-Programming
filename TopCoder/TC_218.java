package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TC_218 {

	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
Scanner sc  = new Scanner(System.in);
	
   


	}
	
	public static String canAccess(int[] rights, int minPermission)
	{
		String res = "";
		for(int i = 0 ; i < rights.length;++i)
		{
			if(rights[i]<minPermission)res +="D";
			else
				res += "A";
			
		}
		
		return res;
	}
}
