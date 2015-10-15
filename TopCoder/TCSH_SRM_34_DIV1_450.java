package Main;

import java.util.Arrays;

public class TCSH_SRM_34_DIV1_450{

	public static void main(String[] args) {

		
		System.out.println(winningNumber(new int[]{100000000,8756}));
		
	}
static int winningNumber(int[] numbers)
{
	
	int max = 0;
	for(int i = 0; i <numbers.length;++i)
	{
		char[] ch =(""+numbers[i]).toCharArray();
		Arrays.sort(ch);
		max=Math.max(max,Integer.parseInt(new String(ch)));
		
	}
	return max;
}
}
