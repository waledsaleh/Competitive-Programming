package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class TC_173 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		
		System.out.println(showProgress(new int[]	


				{419,337,853,513,632,861,336,594,94,367,336,297,966,627,399,433,846,859,80,2}, 19));
		
		
		
		
	}
	static String showProgress(int[] taskTimes, int tasksCompleted)
	{
		int total =0,first=0;
		for(int i = 0 ; i <taskTimes.length;++i)
		{
			total +=taskTimes[i];
			if(tasksCompleted>i)
		    first +=taskTimes[i];
			
		}
		
		
		double per = (double)first/total;
		
		int round = (int) (20*per);
		String res = "";
		int last = Math.abs(round-20);
		for(int i = 0 ; i < round;++i)res +="#";
		for(int i = 0 ; i < last;++i)res +=".";
		
		return res;
	}
}
