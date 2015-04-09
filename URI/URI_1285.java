package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class URI_1285 {

	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	int n , m;
	while(sc.hasNext())
	{
		n= sc.nextInt();
		
		m=sc.nextInt();
		boolean f = true;
		
		int count =0;
		for(int i = n ; i <=m ; ++i)
		{
			String e = String.valueOf(i);
			 f=true;
			 char[] ch = e.toCharArray();
			 Arrays.sort(ch);
			for(int j = 1 ; j <ch.length;++j)
			{
				if(ch[j]==ch[j-1])
				{
					f=false;
		   			break;
				}
				
			}
			if(f)
			count++;
		}
		System.out.println(count);
		
	}
	
	
	}

	
	
}
