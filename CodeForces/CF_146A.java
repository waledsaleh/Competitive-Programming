package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CF_146A {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
	
	int n = sc.nextInt();
	String word = sc.next();
		boolean check = false;
		for(int i = 0 ; i < word.length();++i)
		{
			if(word.charAt(i)=='4'||word.charAt(i)=='7')check=true;
			else
			{
		      check=false;
		      break;
			}
			
		}
		if(check)
		{
			int sum1 =0,sum2=0;
			for(int i = 0 ,j=n/2; i<n/2;++i,++j){
				
				sum1 +=word.charAt(i)-'0';
				sum2 +=word.charAt(j)-'0';
			}
			if(sum1==sum2)System.out.println("YES");
			else
				System.out.println("NO");
		}
		else
			System.out.println("NO");
	}

}
