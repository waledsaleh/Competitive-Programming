package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_11827 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int test =Integer.parseInt(br.readLine());
	int m=0;
	while(test-->0)
	{
	int count=0;int max =Integer.MIN_VALUE;
		
	StringTokenizer st = new StringTokenizer(br.readLine());
		
	int[]array = new int[st.countTokens()];
	
			for(int i=0; i <array.length;i++)
			
			array[i]=Integer.parseInt(st.nextToken());
			
		
		int gcd=0;
		
			for(int i = 0 ; i <array.length;++i)
			{
				for(int j =i+1;j<array.length;j++)
				{
					
					
					max=Math.max(GCD(array[i],array[j]),max);
					
					
				}
			}
			
		
		System.out.println(max);
	}
	
	
	
	
	
	}

	
	public static int GCD(int a , int b)
	{
		
		if(b==0)return a;
		
		else
			return GCD(b,a%b);
		
	}
}
