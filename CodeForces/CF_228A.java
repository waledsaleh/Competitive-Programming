package Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF_228A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer>s = new HashSet<Integer>();
		int n =4;
		while(n-->0)s.add(sc.nextInt());
		System.out.println(4-s.size());
		
		
	}

}
