package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.*;
public class CF_556A {

	public static void main(String[] args) throws  IOException {

		 Scanner sc = new Scanner(System.in);
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 int n =Integer.parseInt(st.nextToken());
		 String word= br.readLine();
	   int[] a = new int[2];
	   for(int i = 0 ; i <n;++i)a[word.charAt(i)-'0']++;
	
		System.out.println(Math.abs(a[1]-a[0]));
		 
		 
		 
	}

}
