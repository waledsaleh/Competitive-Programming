package Main;

import java.io.IOException;
import java.util.Vector;

public class TC_373 {

	
	public static void main(String[] args) throws IOException {

		
		System.out.println(leastSum(998,999,1000));	


		
		
	}
	
	
	public static  int leastSum(int X, int Y, int P)
	{
		Vector<Integer>v  = new Vector<Integer>();
		int sum =0;
		for(int i = 1 ; i <=P;++i)
		{
			for(int j = 1 ; j <=P;++j)
			{
				int div = j*X+i*Y;
				if(div % P==0)
				{
					sum =i+j;
					v.add(sum);
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for(Integer j : v)min = Math.min(min,j);
		
		return min;
	}
}
