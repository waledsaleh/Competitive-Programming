package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TC_571_500 {

	public static void main(String[] args) throws IOException {

		String[] p = playList(109);
		for (String q : p)
			System.out.print(q + " ");

	}

	static String[] playList(int n) {
		List<String> v = new ArrayList<String>();

		for (int i = 1; i <= n; ++i)
			v.add(i + ".mp3");
		Collections.sort(v);
		if (n < 50) {
			return v.toArray(new String[v.size()]);
		}
		List<String> v2 = new ArrayList<String>();
		for (int i = 0; i < 50; ++i)
			v2.add(v.get(i));

		return v2.toArray(new String[v2.size()]);
	}

}
