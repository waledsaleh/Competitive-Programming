package Main;

import java.util.Scanner;

public class TC_634 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = {2,5,3,7,2,8,1,3,1};
		
		System.out.println(countPeaks(a));
		
		
	}
 static 
 int countPeaks(int[] heights)
 { 
	 int count =0;
	 if(heights.length==1)return 1;
		   if(heights.length>1&&heights[heights.length-1]>heights[heights.length-2])count++;
		   if(heights.length>1&&heights[0]>heights[1])count++;
		   
		   
     	 for(int i = 1 ; i <heights.length-1;++i)
     	 {
     		 if(heights[i]>heights[i-1]&&heights[i]>heights[i+1])
     		 {
     			 count++;
     		 }
     		
     	 }
     	 
     
 		
     	 
	 return count;
 }
 
 
}
