package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TC_328 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String a = br.readLine();
	System.out.println(normalize(a));
	
	}
	
	// compareTo method is compare between two strings in lexicographically
	public static String normalize(String necklace)
	{
		String first = null;
		
		int n = necklace.length();
		for(int i = 0 ; i <n;++i)
		{
			String s1=necklace.substring(i,n)+necklace.substring(0,i);
			String s2 =new StringBuilder(s1).reverse().toString();
			if(first==null||first.compareTo(s1)>0)
			{
				first=s1;
			}
			if(first==null||first.compareTo(s2)>0)
			{
				first=s2;
			}
			
		}
		return first;
	}
}
