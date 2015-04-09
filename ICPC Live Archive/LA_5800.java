package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LA_5800 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int test=sc.nextInt();
	while(test-->0)
	{
		int n,r;
		String word;
		n=sc.nextInt();
		r=sc.nextInt();
		word=sc.next();
		String res="";
		
		
		for(int i =0;i<word.length();++i)
		{
			for(int j =1 ; j<=r;++j)
			{
				res+=word.charAt(i);
				
			}
			
			
		}
		
		System.out.println(n+" "+res);
		
		
		
	}
	
	
	
	}
	
	

}
