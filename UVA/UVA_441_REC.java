package Main;

import java.util.Scanner;

public class UVA_441_REC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     boolean first = false;
	  Scanner sc = new Scanner(System.in);	
		StringBuilder sb = new StringBuilder("");
	while(true)	
	{
		int k = sc.nextInt();
		if(k==0)break;
		if(first)sb.append("\n");
		first=true;
		
		int[] a = new int[k];
		for(int i = 0; i < k ;++i)a[i]=sc.nextInt();
		
		for(int i = 0 ; i < k ;++i)
		for(int j = i+1 ; j < k ; ++j)
		for(int m = j+1 ; m<k;++m)
		for(int e = m+1 ; e< k ; ++e)
			for(int n = e+1 ; n<k;++n)
				for(int d = n+1 ; d<k;++d){
					
					sb.append(a[i]+" "+a[j]+" "+a[m]+" "+a[e]+" "+a[n]+" "+a[d]).append("\n");
				}
		
			
	}
		System.out.print(sb);
	}

}
