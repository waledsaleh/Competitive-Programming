package Main;

public class TC_649 {

	public static void main(String[] args) {

		System.out.println(check("siero", "sero"));

	}

	static String check(String s, String t) {

		if (s.equals(t))
			return "Impossible";

		int eraseCheck = 0,j = 0;
		

		for (int i = 0; i < s.length();) {

			if (j < t.length() && s.charAt(i) == t.charAt(j) && eraseCheck != 2) {

				++i;
				++j;

			}

			else {

				if (eraseCheck == 2)
					break;
				++eraseCheck;

				++i;

			}

		}

		return j == t.length() && eraseCheck != 2 ? "Possible" : "Impossible";

	}
}
