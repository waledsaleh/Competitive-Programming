package Main;

import java.util.Scanner;

public class LA_2158 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		while(test-->0)
		{
			long n = sc.nextLong();
		System.out.println(findTrailingZeros(n));
		
		}
		
		
	}
	
	public  static  long  findTrailingZeros(long  number)  {

		long count = 0;

		if(number ==1){

		return 0;

		}

		if(number == 5){
		return 1; 
		}

		for ( int j = 5; number/j >= 1; j *= 5 )
			count  +=  number  /  j;
		
		return count;
		}
}
