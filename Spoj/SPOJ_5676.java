package Main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

// 5676. STONE GAME  Spoj

public class SPOJ_5676 {

	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
	

		int test = sc.nextInt();int num_pile,num;
		while(test-->0)
		{
			num=sc.nextInt();
			for(int i = 1 ; i <=num;i++)
			{
				num_pile=sc.nextInt();
				if(num_pile==i)
				{
					System.out.println("ALICE");break;
				}
			}
			
			
		}
		
	
		
	}
	
}
