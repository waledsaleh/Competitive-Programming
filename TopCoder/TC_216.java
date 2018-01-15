package Main;

public class TC_216 {

	public static void main(String[] args) {

		System.out.println(translate("ZEE ZEE ZE"

		));

	}

	static String translate(String text) {

		StringBuilder res = new StringBuilder(""), innerChar = new StringBuilder("");

		for (int i = 0; i < text.length(); ++i) {

			if (text.charAt(i) == ' ') {

				res.append(innerChar.toString().trim().equals("ZEE") ? "ZED" : innerChar);
				res.append(" ");

				innerChar = new StringBuilder("");
			} else
				innerChar.append(text.charAt(i));

		}

		res.append(innerChar.toString().trim().equals("ZEE") ? "ZED" : innerChar);

		return res.toString();

	}
}
