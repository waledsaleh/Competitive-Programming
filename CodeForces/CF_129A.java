package Main;

import java.util.Scanner;

public class CF_129A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a= new int[n];
		for(int i = 0 ; i < n ;++i)a[i]=sc.nextInt();
	 int c =0;
	 for(int i = 0; i < n ;++i)
	 {
		 int sum =0;
		 for(int j = 0 ; j < n ;++j)
		 {
			 if(j==i)continue;
			 sum +=a[j];
		 }
		 if((sum&1)==0)c++;
	 }
		System.out.println(c);
		
		
		
	}

}
