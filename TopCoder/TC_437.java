package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TC_437 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	System.out.println(find(n));
	
}

public static   int find     (int n)
{
	String e = String.valueOf(n);
	Set<Character> s = new HashSet<Character>();
	for(int i = 0 ; i <e.length();++i)
	{
		s.add(e.charAt(i));
		
	}
	
	
	// Another solution
	
	/*char[] ch = String.valueOf(n).toCharArray();
	String e ="";
	Arrays.sort(ch);
	for(int i = 0 ; i <ch.length;i++)
	{
		
		e+=ch[i];
	}
	StringBuilder sb = new StringBuilder(e);
	
	String w ="";
	
	for(int i = 1 ; i <sb.length();++i)
	{
		if(sb.charAt(i)==sb.charAt(i-1))
		{
			String z = e.charAt(i)+"";
			sb.setCharAt(i-1, ' ');
		//	sb.replace(start, end, str);
		}
		
		
	}
	String q =sb.toString().replaceAll(" ", "");
	*/
	
	
	
	
	
	return s.size();
	
	
}
	
}
