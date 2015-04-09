package Main;

import java.util.Scanner;

public class CF_454B{

	public static void main(String[] args) {
   
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[100010];
		for(int i=1;i<=n;++i)array[i]=sc.nextInt();
	
		int sum =0,tmp=0;
		for(int i =2 ; i <=n;++i)
		{
			if(array[i]<array[i-1])
			{
				sum++;
				tmp =n-i+1;
			}
		}
		if(sum ==0)System.out.println(0);
		else if(sum>1)System.out.println(-1);
		else if(array[n]<=array[1])System.out.println(tmp);
		else
			System.out.println(-1);
	}
	
}
