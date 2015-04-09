package Main;

import java.util.Scanner;

public class SPOJ_2523 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int c= 1;
		while(t-->0)
		{
			int i = sc.nextInt();
			String word = sc.next();
			word = new StringBuilder(word).deleteCharAt(i-1).toString();
			System.out.println(c+" "+word);
			c++;
		}
		
	}

}
