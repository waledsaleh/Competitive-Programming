package Main;

import java.util.Scanner;

public class CF_932A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next();

		System.out.println(word + "" + new StringBuilder(word).reverse().toString());

	}

	static {

	}
}
