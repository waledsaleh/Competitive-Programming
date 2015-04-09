package Main;

import java.util.Scanner;

public class CF_355A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),d = sc.nextInt();
		if(n==1&&d==0)
		{
			System.out.println(0);return;
		}
		if(n!=1&&d==0){System.out.println("No solution");return ;}
		
		System.out.print(d);
		for(int i = 0 ; i<n-1;++i)
		System.out.print(0);
		
		
	}

}
