package Main;

import java.util.Arrays;
import java.util.Scanner;

public class LA_2202 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0)
		{
			int n = sc.nextInt();
			int[]array = new int[n];
			for(int i = 0 ; i < n ; ++i)array[i]=sc.nextInt();
			Arrays.sort(array);
			
			int mid= array.length%2 ==0? (array[array.length/2-1]+array[array.length/2])/2:array[array.length/2];
			int sum =0;
			for(int i = 0 ; i < array.length;++i)sum +=Math.abs(array[i]-mid);
			System.out.println(sum);
			
		}
		
	}

}
