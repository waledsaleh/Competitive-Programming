package Main;

import java.util.Arrays;
import java.util.Scanner;

public class CF_489B{

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
		
         int nb = sc.nextInt();
         int[] boy = new int[nb];
        for(int i = 0; i<nb;++i)boy[i]=sc.nextInt();
		int ng = sc.nextInt();
		int[] gi = new int[ng];
		for(int i = 0; i <ng;++i)gi[i]=sc.nextInt();
		
		
		Arrays.sort(boy);
		Arrays.sort(gi);
		int count =0;
		for(int i =0 ; i <nb ; ++i)
		{
			
			for(int j = 0 ; j < ng ;++j)
			{
				if(Math.abs(boy[i]-gi[j])<=1)
				{
					count++;
					gi[j] = 1000;
		           
		            break;
				}
				
			}
				
				
		}
		System.out.println(count);
		
		
	}

}
