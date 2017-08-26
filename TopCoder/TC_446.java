package Main;
import java.util.Scanner;

public class TC_446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(count(10000000, 2, 3));

	}

	static int count(int n, int lowerBound, int upperBound) {

		int count = 0;
		for (int i = 1; i <= n; ++i) {

			int len = (int) Math.log10(i) + 1;
			if (len >= lowerBound && len <= upperBound)++count;

				
		}
		return count;

	}

}
