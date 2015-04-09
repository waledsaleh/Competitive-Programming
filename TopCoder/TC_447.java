package Main;

import java.util.Arrays;
import java.util.Scanner;

public class TC_447 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println(maximalCost(new int[]	

				

				{100},new int[]{100,100}));
		
		
	}
	static int maximalCost(int[] complexity, int[] computers)
	{
		// SRM 447 div2
		Arrays.sort(complexity);
		Arrays.sort(computers);
		int min =  Math.min(complexity.length, computers.length);
		int count =0;
		for(int i = 0 ; i <min;++i)
		{
			for(int j=i;j<computers.length;++j)
			{
			
			if(complexity[i]<=computers[j]&&computers[j]!=-1)
			{
				count++;
				computers[j]= -1;
				break;
			}
			
			}
		}
		return count;
	}
}
