package Main;

import java.util.Arrays;
import java.util.Scanner;

public class LA_4084 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int sum =0;
		
			int[] array = new int[6];
			int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
			for(int i = 0 ; i < 6 ;++i)
			{
				array[i]=sc.nextInt();sum +=array[i];min = Math.min(min, array[i]);
			max = Math.max(max, array[i]);
			}
		
			if (array[0] == 0 && array[1] ==0 && array[2] ==0 && array[3] == 0 && array[4] == 0 && array[5] == 0 )break;
			sum -=max+min;
		
			if((double)sum/4==sum/4)System.out.println((int)sum/4);
			else
				System.out.println((double)sum/4);
				
		
		}
		
		
	}

}
