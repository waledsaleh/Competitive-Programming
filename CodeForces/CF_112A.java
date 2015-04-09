package Main;

import java.util.Scanner;

public class CF_112A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String f = sc.next();
		String s = sc.next();
		if(f.compareToIgnoreCase(s)<0)System.out.println(-1);
		else if(f.compareToIgnoreCase(s)==0)System.out.println(0);
		else
			System.out.println(1);
		
		
		
	}

}
