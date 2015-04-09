package Main;

import java.util.Arrays;

public class TC_408_500 {

	public static void main(String[] args) {
		
		System.out.println(numberOfNights(new int[]{2,2,2,4}));
		

	}

	static int numberOfNights(int[] candles)
	{
	int ret = 1;
	int N = candles.length;
	while(true)
	{
	    Arrays.sort(candles);
	    for(int i=0; i < ret; i++)
	    {
	        if(N-1-i < 0 || candles[N-1-i]==0)
	            return ret-1;
	        
	    else
	    	candles[N-1-i]--;
	        
	    }
	    
	    ret++;
	    
	}

	}
	
	
	
}
