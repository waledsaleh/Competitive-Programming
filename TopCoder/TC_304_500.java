package Main;

import java.io.IOException;
import java.util.Vector;

public class TC_304_500 {
	public static void main(String[] args) throws IOException {

		
		System.out.println(difference(2,new double[]{3,8,9,15}));
		
	}
	
	static 	double difference(int k, double[] data)
	{
		double min =Double.MAX_VALUE;
			double max = 0.0;

		for(int i = 0 ; i < data.length-k+1;++i)
		{
		
		double sum =0.0;
			for(int j = 0 ;j<k;++j)
			{
				
			   sum +=data[i+j];
			     
			}
			
			min = Math.min(min, sum/k); max = Math.max(max, sum/k);
		}
			
			
			return max-min;
			
	}
}
