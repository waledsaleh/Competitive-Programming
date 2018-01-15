package Main;

import java.util.ArrayList;
import java.util.List;

public class TC_258 {

	public static void main(String[] args) {

		System.out.println(findMode(new int[] { 0, 0, 0, 1, 1 }));

	}

	// TC_258
	static int[] findMode(int[] scores) {

		int[] occ = new int[101];

		boolean flag = false;
		int maxOcc = 0;
		for (int i = 0; i < scores.length; ++i) {

			++occ[scores[i]];
			if (occ[scores[i]] > 1) {
				flag = true;
				maxOcc = Math.max(maxOcc, occ[scores[i]]);
			}
		}

		List<Integer> res = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < 101; ++i) {
			if (flag) {
				if (occ[i] == maxOcc) {

					++count;
					res.add(i);
				}
			} else {
				if (occ[i] == 1) {
					res.add(i);
					++count;
				}
			}
		}

		int[] finalRes = new int[count];
		int indx = 0;

		for (Integer i : res)
			finalRes[indx++] = i;

		return finalRes;

	}
}
