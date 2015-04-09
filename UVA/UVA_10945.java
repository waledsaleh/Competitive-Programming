package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10945 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	while(true)
	{
	String s = br.readLine();
	if(s.equals("DONE"))
	{
break;

	}
 s =s.toLowerCase(); 
 
	StringBuilder sb = new StringBuilder("");
	
	for(int z = 0 ; z <s.length();++z)
	{
	  
	   if(s.charAt(z)>96&&s.charAt(z)<123)
	   {
		   sb.append(s.charAt(z));
	   }
		
	}
String r =sb.toString();

	if(pal(r))
	{
	System.out.println("You won't be eaten!");
	}
	else
	{
		System.out.println("Uh oh..");
	}
	
	}
	
	}
	
	public static boolean pal(String r)
	{
		
		for(int i = 0 ,j=r.length()-1;i<r.length()/2;i++,j--)
		{
				if(r.charAt(i)!=r.charAt(j))
				{
				return false;
				}
				
			
		}
		return true;
	}
	}

