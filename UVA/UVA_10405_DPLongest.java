package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10405_DPLongest {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	

	 int[][] array = new int[2000][2000];
	 
      String s1,s2;
      
      while(true)
      {
    	  s1=br.readLine();
    	  s2 = br.readLine();
    	  if(s1==null&&s2==null)break;
    	  int len1=s1.length();
    	  int len2=s2.length();
    	for(int i =1 ; i <=s1.length();++i) 
    	{
    		for(int j =1 ; j <=s2.length();++j)
    		{
    			if(s1.charAt(i-1)==s2.charAt(j-1))
    				array[i][j]=1+array[i-1][j-1];
    			else
    				array[i][j]=Math.max(array[i-1][j], array[i][j-1]);
    		}
    	}
    	  System.out.println(array[len1][len2]);
    	  
    	  
    	  
      }
	
	
	}
// 	 public static int longestSubsequence(String s1, String s2, int i, int j) {

//         if (i >= s1.length() || j >= s2.length()) return 0;

//         if (memo[i][j] != 0)
//             return memo[i][j];

//         if (s1.charAt(i) == s2.charAt(j))
//             return memo[i][j] = 1 + longestSubsequence(s1, s2, i + 1, j + 1);

//         return memo[i][j] = Math.max(longestSubsequence(s1, s2, i + 1, j), longestSubsequence(s1, s2, i, j + 1));

    }
	
}
