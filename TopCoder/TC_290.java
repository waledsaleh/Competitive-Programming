package Main;

import java.util.Arrays;

public class TC_290 {

	public static void main(String[] args) {

		System.out.println(lettersToPractice("dcab",new int[]{250, 300, 400, 800}));
		
		
	}
	
	
 static 	 String lettersToPractice(String letters, int[] times)
 {
	String res ="";
	int[] curr = new int[times.length];
	curr[0]=times[0];
	int avg=0,sum=times[0];
	for(int i=1;i<times.length;++i)
	{
		curr[i] =times[i]-times[i-1];
	    sum +=curr[i];
	}
	avg = sum/times.length;
	for(int i = 0 ; i <curr.length;++i)
	{
		res += (curr[i]>avg)? letters.charAt(i):"";
	}
	return res;
 }
 
 
}
