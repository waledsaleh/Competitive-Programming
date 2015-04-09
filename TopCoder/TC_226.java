package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_226 {
	public static void main (String [] args) throws IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		     Scanner sc  = new Scanner(System.in);
		     
		     System.out.println(makeAcronym("the united states of america"));
	}
	
	public static 	String makeAcronym(String longName)
	{
		String res = "";
	//	longName = longName.replaceAll("and", "").replaceAll("of", "").replaceAll("the", "");
		String[] split = longName.split(" ");
		
		for(int i = 0 ; i < split.length;++i)
		{
			if(split[i].equals("")||split[i].equals(" "))continue;
			else if(split[i].equals("and"))continue;
			else if(split[i].equals("the"))continue;
			else if(split[i].equals("of"))continue;
			res +=(char)(split[i].charAt(0)-'a'+'A');
			
		}
		return res;
	}

}
