package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class TC_372 {

	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
     Scanner sc  = new Scanner(System.in);
    
     
    System.out.println(chooseDinner("IWANTSODER","SOW","RAT"));
    
	}
	
	public static String chooseDinner(String diet, String breakfast, String lunch)
	{
		Set<Character>set = new HashSet<Character>();
		
	char[] ch1 = breakfast.toCharArray();
	char[] ch2 = lunch.toCharArray();
		
		for(int i = 0 ; i < diet.length(); ++i) set.add(diet.charAt(i));
		
		
		for(int i = 0 ; i <ch1.length;++i)
		{
			if(set.contains(ch1[i]))
			{
				set.remove(ch1[i]);
				
			}
			else
			{
				return "CHEATED";
			}
		}
		
		for(int i = 0 ; i <ch2.length;++i)
		{
			if(set.contains(ch2[i]))
			{
				set.remove(ch2[i]);
				
			}
			else
			{
				return "CHEATED";
			}
		}
		String res ="";
		Vector<Character>v = new Vector<Character>(set);
		
		Collections.sort(v);
		
		for(int i = 0 ; i <v.size();++i)res+=v.get(i);
		
		return res;
		
	}

}