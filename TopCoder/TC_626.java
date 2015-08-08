package Main;

import java.math.BigInteger;
import java.util.*;

public class TC_626 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(findSum(new int[]	

{3,14,15,92,65}));
		
		
	}
	static int findSum(int[] array)
	{
		int res=0;
		for(int i = 0 ; i < array.length;++i)
		{
			for(int j =i;j<array.length;++j)
			{
				for(int k = i ; k<=j;++k)
				{
					res +=array[k];
				}
			}
					
		}
		
		return res;
	}
	}

