package Main;

import java.util.Arrays;

public class TC_242 {

	public static void main(String[] args) {

		
		System.out.println(difference(new int[]	

				{5,7,8,4,2}));
		
	}
	static int difference(int[] strengths)
	{
		Arrays.sort(strengths);int res =0;
		
		
		for(int i = strengths.length-1;i>0;i-=2)res +=(strengths[i]-strengths[i-1]);
			
		if((strengths.length&1)!=0)res +=strengths[0];
		
		return res;
		
		
	}
}
