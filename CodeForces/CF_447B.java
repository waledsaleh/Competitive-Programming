package Main;

import java.util.Hashtable;
import java.util.Scanner;

public class CF_447B {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int k = sc.nextInt();
		
		int[] w = new int[26];
		int max =0;
		for(int i = 0 ; i <w.length;++i)
		{
			w[i]=sc.nextInt();
			max = Math.max(max, w[i]);
		}
		int res =0;
		for(int i = 0 ; i <word.length();++i)res +=w[word.charAt(i)-'a']*(i+1);
		
		for(int i = word.length();i<word.length()+k;++i)res +=max*(i+1);
		System.out.println(res);
		
	}

}
