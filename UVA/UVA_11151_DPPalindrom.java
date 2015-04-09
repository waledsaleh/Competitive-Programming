package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class UVA_11151_DPPalindrom {

	 static int[][] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
			char[] word = br.readLine().toCharArray();
			dp = new int[word.length][word.length];
			
			for(int i = 0 ; i<dp.length;++i)Arrays.fill(dp[i], -1);
			
			System.out.println(length(word,0,word.length-1));
			
			
			
		}
	}
   
	public static int length(char[] word,int i,int j)
	{
	
		 if(i>j)return 0;
				 
		if(i==j)return 1;
		 
		if(dp[i][j]!=-1)return dp[i][j];
		
		int res=0;
		if(word[i]==word[j])
		{
		res =length(word,i+1,j-1)+2;
	
		}
		else
			res = Math.max(length(word,i+1,j), length(word,i,j-1));
		
		return dp[i][j]=res;
		
	}
}
