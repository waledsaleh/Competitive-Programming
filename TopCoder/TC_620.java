package Main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;

public class TC_620 {

	public static void main(String[] args) throws IOException {

		String[]a ={"ACB", "BAC", "CBA"};
		
		System.out.println(sort(a,1));	

		
	}
	
	static 	int[] sort(String[] score, int x)
	{
		
		char[] ch =new char[]{'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K','L', 'M', 'N','O', 'P','Q', 'R'
				, 'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z'};
		
		int[] array = new int[score.length];
		int count =0;
		for(int i = 0 ; i < ch.length;++i)
		{
			for(int e = 0 ; e < score.length;++e)
			{
			String q = score[e];
			for(int j = 0; j < q.length();++j)
			{
				if(ch[i]==q.charAt(j)&&j==x)
				{
					//v.add(e);
					array[count]=e;
					count++;
					break;
				}
			}
			
			
			}
		}
		
		return array;
	}
	
	
}
