package Main;

import java.io.IOException;
import java.util.Scanner;

public class CF_38A {

	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in);
			int test=sc.nextInt();
			int[] array = new int[test-1];
			for(int i = 0 ; i < array.length;++i)array[i]=sc.nextInt();
			
		//	Arrays.sort(array);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
		 System.out.println(year(array,a,b));
		
	}
	public static int year(int[] array, int a , int b) 
	{
	    int res =0;	
		
	    int count = Math.abs(b-a);
			for(int i =a-1 ;count !=0;++i)
			{
				res +=array[i];
				count--;
			}
			
		return res;
	}
}
