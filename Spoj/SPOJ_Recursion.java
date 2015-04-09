package Main;

import java.util.Scanner;

public class SPOJ_Recursion {
static long sum =0;

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		int count =1;
		while(test-->0)
		{
			int n =sc.nextInt();
			int[]array = new int[n];
			for(int i = 0 ; i <n;++i)array[i]=sc.nextInt();
			
			System.out.println("Case "+count+": "+sum(array,0));
			sum =0;
			++count;
		}
		
	}
   public static long sum (int[] array,int i)
   {
	   if(i<array.length)
	   {
		 
	   sum +=array[i];
		  sum(array,i+1);
	   }
	   
	   return sum;
   }
}
