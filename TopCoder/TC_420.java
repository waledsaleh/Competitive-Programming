package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_420 {
	public static void main (String [] args) throws IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
  Scanner sc  = new Scanner(System.in);

       int[] a = {0,1,0,0,4,0,6,7};
       System.out.println(rearrange("RBRRBRBB",a));
  
	}
	
	public static String rearrange(String deck, int[] above)
	{
		StringBuilder sb = new StringBuilder("");
		String res = "";
		for(int i = 0 ; i < above.length;++i)
		{
			sb.insert(above[i], deck.charAt(i));
			
		}
		return sb.toString();
	}
	
}
