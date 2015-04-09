package Main;

import java.util.Scanner;

public class CF_447C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		if(n==1){System.out.println(1);return;}
		
		int[]a = new int[100009];
		int[] st=new int[100009],dr=new int[100009];
		
		int maxi=0;
		int i;
		for( i = 1 ; i<= n;++i)a[i]=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
		    if(a[i]>a[i-1]) st[i]=st[i-1]+1;
		    else st[i]=1;
		}
		for(i=n;i>=1;i--)
		{
		    if(a[i]<a[i+1]) dr[i]=dr[i+1]+1;
		    else dr[i]=1;
		}
		maxi=1;
		for(i=1;i<n;i++)
		    if(dr[i+1]+1>maxi) maxi=dr[i+1]+1;
		for(i=2;i<=n;i++)
		    if(st[i-1]+1>maxi) maxi=st[i-1]+1;
		if(dr[1]>maxi) maxi=dr[1];
		if(st[n]>maxi) maxi=st[n];
		for(i=2;i<n;i++)
		    if(a[i-1]<a[i+1]-1&&st[i-1]+dr[i+1]+1>maxi) maxi=st[i-1]+dr[i+1]+1;
		System.out.printf("%d\n",maxi);
		
		
}

	
}