package Main;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class TC_627 {

	public static void main(String[] args) {
	
		
		System.out.println(howManySquares(new int[]{3, 1, 4, 4, 4, 10, 10, 10, 10}));
		
	}
	
	static  int howManySquares(int[] sticks)
	{
		int[] array = new int[sticks.length];
		int count =1;
		int res =0;
		Arrays.sort(sticks);
		for(int i = 1 ; i < sticks.length;++i)
		{
				if(count>=4)
				{
					res++;count=1;
				}
				else if(sticks[i]==sticks[i-1])
				{
					count++;
				}
				else
					count=1;
			
		}
		if(count>=4)
		{
			res++;count=1;
		}
		return res;
		
	}

}
