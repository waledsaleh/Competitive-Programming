package Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class CF_499B{

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int m = sc.nextInt();
	HashMap<String,String>map = new HashMap<String,String>();
	while(m-->0)
	{
		String first = sc.next(),sec=sc.next();
		if(first.length()<=sec.length())map.put(first, first);
		else
			map.put(first, sec);
		
	}
	
	for(int i =0; i < n ;++i)
	{
		String word = sc.next();
	System.out.print(map.get(word)+" ");
		
	}
	
	
	
	}
   
   
   
   
}
