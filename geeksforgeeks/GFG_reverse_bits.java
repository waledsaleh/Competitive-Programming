package Main;

import java.util.Scanner;

/*  https://practice.geeksforgeeks.org/problems/reverse-bits/0 */

public class GFG_reverse_bits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {

			long n = sc.nextLong();

			String bin = getBinaryNumber(n);

			System.out.println(sumBits(bin));

		}

	}

	static long sumBits(String bin) {

		long sum = 0;

		for (int i = 0; i < bin.length(); ++i) {

			if (bin.charAt(i) == '1')
				sum += (long) Math.pow(2, 31 - i);

		}

		return sum;
	}

	static String getBinaryNumber(long n) {

		String res = "";

		while (n != 0) {

			res += n % 2;

			n >>= 1;

		}

		return res;

	}

}
