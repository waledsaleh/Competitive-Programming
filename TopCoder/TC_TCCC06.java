package Main;

import java.util.HashSet;
import java.util.Set;

public class TC_TCCC06 {

	public static void main(String[] args) {

		System.out.println(count("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

	}

	static int count(String s) {

		
		Set<String> distinctWords = new HashSet<>();

		

		for (int i = 0; i < s.length(); ++i) {
			StringBuilder word = new StringBuilder("").append(s.charAt(i));
		

			for (int j = i + 1; j < s.length(); ++j) {

				StringBuilder after = new StringBuilder("");
				
				after.append(s.charAt(j));
				if (word.toString().equals(after.toString()))
					distinctWords.add(word.toString() + "" + after.toString());

				
				for (int k = j + 1; k < s.length(); ++k) {

					after.append(s.charAt(k));

					if (word.toString().equals(after.toString()))
						distinctWords.add(word.toString() + "" + after.toString());

				}
				word.append(s.charAt(j));

			}

		}

		return distinctWords.size();
	}
}
