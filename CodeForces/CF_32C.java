package Main;

import java.util.Scanner;

public class CF_32C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int n1 = n % s;
		if (n1 == 0)
			n1 = s;
		int m1 = m % s;
		if (m1 == 0)
			m1 = s;
		int n2 = (n - n1) / s + 1;
		int m2 = (m - m1) / s + 1;
		long ans = n1 * n2;
		ans *= m1 * m2;
		System.out.println(ans);
		
		
	}

}
