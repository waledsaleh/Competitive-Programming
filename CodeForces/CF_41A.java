package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_41A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String word1 = sc.next();
	String word2 = sc.next();
	word1 = new StringBuilder(word1).reverse().toString();
	if(word2.equals(word1))System.out.println("YES");
	else
		System.out.println("NO");
	
	
	}

}


