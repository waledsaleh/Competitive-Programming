package Main;

import java.util.Scanner;

public class CF_215A{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[]a = new int[n];
		for(int i = 0 ; i < n ;++i)a[i]=sc.nextInt();
		int m  =sc.nextInt();
		int[]b= new int[m];
		for(int i = 0 ; i < m ;++i)b[i]=sc.nextInt();
		int c = 0;
		int max = 0;
		for(int i  =0 ; i < n ;++i)
		{
			for(int j = 0 ; j < m ; ++j)
			{
				if(b[j]%a[i]==0){
				int curr = b[j]/a[i];
				if(curr>max)
				{
					max = curr;
					c = 0;
				}
				
				if(curr==max)c++;
				
				}
				
				
			}
		}
		System.out.println(c);
		
	}

}
