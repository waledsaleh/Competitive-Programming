package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TC2014_450_1C {
	public static void main(String[] args) throws IOException, Exception {
		
		String q = "942493741554318791";
		long[] array =counts(2,Long.valueOf(q));
		for(Long j : array)System.out.print(j+" ");
		
	}
	
	
	static long[] counts(long A, long B)
	{
		long[]array = new long[3];
		
		
		array[2]=(B/15)-(A-1)/15;//fizz & buzz
		array[1]=(B/5)-(A-1)/5-array[2];//buzz
		array[0]=(B/3)-(A-1)/3-array[2];//fizz
		return array;
	}
	
  
}
