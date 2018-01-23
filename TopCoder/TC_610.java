package Main;

import java.util.ArrayList;
import java.util.List;

public class TC_610 {

	public static void main(String[] args) {

		System.out.println(CountNumbers(new int[] { 9, 2 }

		));

	}

	static int CountNumbers(int[] numbers) {

		List<Integer> resList = new ArrayList<>();
		for (int num : numbers)resList.add(num);
			

		for (int i = 0; i < resList.size(); ++i) {

			for (int j = 0; j < resList.size(); ++j) {

				if (resList.get(i) > resList.get(j) && !resList.contains(resList.get(i) / resList.get(j))) {

					resList.add(resList.get(i) / resList.get(j));

					i = j = 0;
				}

			}

		}

		return resList.size();

	}
}
