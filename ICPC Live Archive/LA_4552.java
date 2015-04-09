package Main;

import java.util.Arrays;
import java.util.Scanner;

public class LA_4552 {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

      
         int test = sc.nextInt();
         while(test-->0)
         {
        	 int[] array = new int[10];
        	 int n = sc.nextInt();
        	 for(int i = 0 ; i < 10 ; ++i)array[i]=sc.nextInt();
        	 
        	 Arrays.sort(array);
        	 
        	 System.out.println(n+" "+array[array.length-3]);
        	 
        	 
         }
		
         
	}

	
}
