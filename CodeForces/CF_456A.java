package Main;

import java.util.Scanner;

public class CF_456A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean check = false;
		while(n-->0)
		{
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if(n1!=n2)check = true;
		
		}
		if(check)System.out.println( "Happy Alex");
		else
			System.out.println("Poor Alex");
	}

}
