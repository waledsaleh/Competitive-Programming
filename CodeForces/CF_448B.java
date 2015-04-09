package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class CF_448B {

	public static void main(String[] args) throws NumberFormatException, IOException {
        
		Scanner sc = new Scanner(System.in);
		int[] cnt=new int[26];
		String s = sc.next();
		String t = sc.next();
		int l0 = s.length(), l1 = t.length();
		for (int i = 0; i < l0; ++i) {
			++cnt[s.charAt(i) - 'a'];
		}
		for (int i = 0; i < l1; ++i) {
			--cnt[t.charAt(i)- 'a'];
		}
		boolean automation = true, array = true, both = true;
		for (int i = 0; i < 26; ++i) {
			array = array && cnt[i] == 0;
			both = both && cnt[i] >= 0;
		}
		int j = 0;
		for (int i = 0; i < l0; ++i) {
			if (j < l1 && t.charAt(j) == s.charAt(i)) {
				++j;
			}
		}
		automation = j == l1;
		String ans;
		if (automation) {
			ans = "automaton";
		} else if (array) {
			ans = "array";
		} else if (both) {
			ans = "both";
		} else {
			ans = "need tree";
		}
		System.out.printf("%s\n", ans);
		
	}

}
