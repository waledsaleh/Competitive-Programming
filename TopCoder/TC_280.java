package Main;

import java.util.Arrays;
import java.util.Scanner;

public class TC_280
{
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(count(10000));
		
		
		
	}
	static int count(int n)
	{
		
		int count =0;
		for(int i = 1 ;i<n;++i )
		{
			boolean f= false;
			String s = String.valueOf(i);
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			for(int j=1;j<ch.length;++j)
			{
				if(ch[j]==ch[j-1])
				{
					f=true;
					break;
				}
			}
			if(!f)count++;
			
		}
		
		return count;
		
	}
	}
