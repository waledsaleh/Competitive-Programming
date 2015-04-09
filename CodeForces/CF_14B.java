package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class CF_14B {

	public static void main(String[] args) throws IOException {
		  
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
		int x0 = in.nextInt();
		int l = Integer.MIN_VALUE;
		int r = Integer.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a > b) {
				a ^= b;
				b ^= a;
				a ^= b;
			}
			l = Math.max(l, a);
			r = Math.min(r, b);
		}
		if (l > r) {
			System.out.println(-1);
		} else {
			if (l <= x0 && x0 <= r) {
				System.out.println(0);
			} else {
				System.out.println(Math.min(Math.abs(x0 - l), Math.abs(x0 - r)));
			}
		}
	}
	
}
