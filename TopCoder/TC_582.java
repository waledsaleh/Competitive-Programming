package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_582 {
	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	 
	     System.out.println(check(847));
	     
	}
	static 	String check(int N)
	{
		/*
		for(int i =2 ; i*i <=N;++i)
		{
			for(int j = 1 ; j < i;++j)
			{
				
				if(i*i*j==N)return "YES";
				
			}
		}
		return "NO";
		*/
		
		//Another solution 
		for(int i = 1 ; i*i<=N;++i)
		{
			int sq = i*i;
			if(N % sq==0)continue;
			int div = N/sq;
			if(div<N)return "Yes";
			
		}
		return "No";
				
		
	}
}
