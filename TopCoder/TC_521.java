package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TC_521 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println(minPaints("RRRGGGRGGGRGGRRRGGRRRGR"));
	
	}
	
	public static int minPaints(String first)
	{
		
		int an = Integer.MAX_VALUE;
		
		for(int i = 0 ; i <=first.length();++i)
		{
			int count =0;
			for(int j = 0 ; j <i;++j)
			{
			if(first.charAt(j)!='R')
			count++;
			}
			
			for(int e = i ; e <first.length();++e)
		{
			if(first.charAt(e)!='G')
			count++;
		}
			
		if(count<an)
			an= count;
		
		}
		
		return an;
		
	}
	
}
