package Main;

public class TC_575 {

	public static void main(String[] args) {

		System.out.println(find(new int[] { 38, 9, 5, 35, 25 }));

	}

	static int find(int[] sequence) {

		int count = 0;
		boolean occ = false;

		for (int i = 0; i < sequence.length; ++i) {

			for (int j = i + 1; j < sequence.length; ++j) {

				if (sequence[i] != sequence[j]) {

					++count;

				} else
					occ = true;

			}

		}

		count += occ == true ? 1 : 0;

		return count;
	}

}
