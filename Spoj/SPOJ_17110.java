package Main;

import java.io.IOException;
import java.util.Scanner;

public class SPOJ_17110 {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		while(test-->0)
		{
			int n = sc.nextInt();
		int[] array = new int[n];
		int[] array2 = new int[n];
		for(int i = 0 ; i < n ; ++i)
		{
			array[i]=sc.nextInt();
			array2[i]=sc.nextInt();
		}
        int r1=0,r2=0;
        int index =0;
		for(int i = 0 ; i<n;++i )
		{
			if(array[i]>r1)
			{
				r1 = array[i];
				index =i+1;
			}
			else if(array2[i]>r2)r2 =array2[i];
		}
		
		if(r2<r1)System.out.println(index);
		else
			System.out.println(-1);
		
		}
		
	}
	
}
