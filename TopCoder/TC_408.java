package Main;

import java.io.IOException;

public class TC_408 {
	
	public static void main(String[] args) throws IOException {

		
	System.out.println(getPoints(new int[]{8, 16, 32},new int[]{10, 10, 5}));
		
		
	}
	static  int getPoints(int[] rawScores, int[] conversionFactor)
	{
		double sum =0.0;
		
		for(int i = 0 ; i < rawScores.length;++i)
		{
			sum +=(double)rawScores[i]/conversionFactor[i];
			sum = Math.round(sum);
			
		}
		System.out.println(Math.round(sum));
		return (int)sum;
	}
}
