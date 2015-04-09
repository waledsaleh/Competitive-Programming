package Main;

import java.io.IOException;
import java.util.Arrays;

public class TC_498 {
	public static void main(String[] args) throws IOException, Exception {
		
		System.out.println(getMaximumPoints(36,36,36,13));
		
		
	}
	
	static int getMaximumPoints(int A, int B, int C, int N)
	{
		int sum = 0 ;
		int[] array = {A,B,C};
		Arrays.sort(array);
		
		for(int  i =1 ; i <=N;++i)
		{
			sum +=(array[2]>0?array[2]:0);
			array[2]--;
			Arrays.sort(array);
			/*if(A>=B&&A>=C)
			{
				if(A>0)
				{
					sum +=A;
					A--;
					
				}
			}
			else if(B>=A&&B>=C)
			{
				if(B>0)
				{
					sum +=B;
					B--;
					
				}
			}
			else 
			{
			sum +=C;
				C--;			
			}
			*/
			
		}
		
		return sum;
		
	}
}
