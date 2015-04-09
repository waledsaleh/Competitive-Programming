package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_474 {
	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	
	     System.out.println(count("Topcoder","coder"));
	}
	public static 	int count(String A, String B)
	{
		int count =0;
		
		for(int i =0 ; i < A.length();++i)
		{
			StringBuilder sb = new StringBuilder(A);
			sb.insert(i, B);
			if(plain(sb.toString()))count++;
			
			//Another thing to check , Are this palin or not
			//(sb.reverse().tostring().equals(sb.reverse().tostring())
		}
		if(plain(A+""+B))count++;
		
		return count;
	}
	public static boolean plain ( String a)
	{
		int low =0 ;
		int high = a.length()-1;
		while(low<=high)
		{
			if(a.charAt(low)!=a.charAt(high))return false;
			low++;
			high--;
			
		}
	return true;	
		
	}

}
