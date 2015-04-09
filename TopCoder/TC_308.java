package Main;

import java.io.IOException;
import java.util.Arrays;

public class TC_308{
	public static void main(String[] args) throws IOException {

		System.out.println(findMedian(new int[]{1,5,3,4,5}));
	}
	static int findMedian(int[] numbers)
	{
		
		if(numbers.length%2!=0)
		{
			Arrays.sort(numbers);
			return numbers[numbers.length >> 1];
			
		}
		return -1;
	}
}
