package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class TC_631 {
    
	public static void main(String[] args) throws IOException {
		 
		Scanner sc = new Scanner(System.in);
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
	   String[] g={"BWB",
			   "BBW",
	           "BWB"};
	        System.out.println(getNumber(g));
	        
	}
	
   static  int getNumber(String[] grid)
{
	   if(grid.length==1)return 1;
	   
	   char[][] ch = new char[grid.length][grid.length];
	for(int i = 0 ; i < grid.length;++i)
	{
		String e = grid[i];
		for(int j =0 ; j <e.length();++j)ch[i][j]=e.charAt(j);
		
	}
	int count=1;
	List<Integer>list = new ArrayList<Integer>();
	
	for(int j = 0 ; j < ch.length;++j)
	{
		count =1;
	for(int i = 0 ; i <ch.length-1;++i)   
	{
		if(ch[i][j]==ch[i+1][j])count++;
		else
		{
			list.add(count);
			count =1;
		}
		list.add(count);
		
	}
	
	}
	   int max =Integer.MIN_VALUE;
	   for(int i = 0 ; i < list.size();++i)max = Math.max(max, list.get(i));
	   return max;
	
}


}
