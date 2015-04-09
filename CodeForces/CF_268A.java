package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CF_268A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc =new Scanner(System.in);
	
		int n = sc.nextInt();
		List<Integer>list = new ArrayList<Integer>();
		for(int i = 1 ; i <=n;++i)list.add(i);
		
		int p = sc.nextInt();
		while(p-->0)
		{
			int Num = sc.nextInt();
			if(list.contains(Num))list.remove(list.indexOf(Num));
		}
		int q = sc.nextInt();
		while(q-->0)
		{
			int Num = sc.nextInt();
			if(list.contains(Num))list.remove(list.indexOf(Num));
		}
		if(list.isEmpty())System.out.println("I become the guy.");
		else
			System.out.println("Oh, my keyboard!");
		
	}

}
