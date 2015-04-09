package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class TC_611_500 {

	
	public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int[] s ={100,200,300,400,500,600};
		
		System.out.println(include(s,8000));
		
		
		
	}
	
	public static String include(int[] S, int x)
	{
		int t = 1;
		
		    
		    	for(int j = 0 ; j <S.length;++j)
		    	{
		    		if(x%S[j]==0)
		    		{
		    	 t=(lcm(t, S[j]));
		    	 if(t>x)return "Impossible";
		    	 
		    		}
			   
		    	}
		    
		if(t==x)return "Possible";
		
		return "Impossible";
	}
	


	private static long gcd(long a, long b)
	{
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}

	
	private static int lcm(int a, int b)
	{
	    return (int) (a * (b / gcd(a, b)));
	}

	
}
