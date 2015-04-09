package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TC_443 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	String[] s = new String[3];
	for(int i = 0 ; i <s.length;++i)s[i]=br.readLine();
	int[] r = points(s);
	for(int j :r)
	System.out.print(j+" ");
	}
	public static int[]points(String[] s)
	{
		
		int[]p = new int[s.length];
		for(int i = 0 ; i <s.length;i++)
		{
			for(int j = 0 ; j <s[i].length();++j)
			{
				if(s[i].charAt(j)=='W')p[i]+=3;
				else if(s[i].charAt(j)=='L')p[j]+=3;
				else if(s[i].charAt(j)=='D')
				{
					p[i]+=1;
					p[j]+=1;
					
					
				}
				
			}
			
			
		}
		return p;
		
	}
	
}
