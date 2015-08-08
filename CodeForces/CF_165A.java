package Main;

import java.util.Scanner;

public class CF_165A {

	public static void main(String[] args) {
  
		 Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count =0;
		int[]x=new int[n],y=new int[n];
		for(int i = 0; i <n ;++i){x[i]=sc.nextInt();y[i]=sc.nextInt();}
		
		for(int i =0; i <n ;++i)
		{
			int u=0,low=0,left=0,right=0;
			for(int j = 0 ; j < n ;++j)
			{
				if(i==j)continue;
				if(x[i]>x[j]&&y[i]==y[j])right++;
				if(x[i]<x[j]&&y[i]==y[j])left++;
				if(x[i]==x[j]&&y[i]<y[j])low++;
				if(x[i]==x[j]&&y[i]>y[j])u++;
			}
			if(right>=1&&u>=1&&left>=1&&low>=1)count++;
		}
		
		System.out.println(count);
		
	}

}
