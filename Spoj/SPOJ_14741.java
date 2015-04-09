package Main;

import java.util.Scanner;

public class SPOJ_14741 {

	static int count =0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext())
		{
		int n  = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(div(n,c));
		}
	}
	public static int div(int n,int c)
	{
		 
		if(n<=c)return 1;
		
		
		return div(n-n/2,c)+div(n/2,c);
		
		
	 }
	 

}


