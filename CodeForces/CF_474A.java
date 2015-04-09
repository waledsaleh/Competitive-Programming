package Main;

import java.util.Scanner;

public class CF_474A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String get="qwertyuiopasdfghjkl;zxcvbnm,./";

		char ch =sc.next().charAt(0);
		String word = sc.next();
		String res ="";
		if(ch=='R')
		{
			for(int i = 0 ; i <word.length();++i)
			{
				int index = get.indexOf(word.charAt(i));
				res +=get.charAt(index-1);
				
			}
		}
		else
		{
			for(int i = 0 ; i <word.length();++i)
			{
				int index = get.indexOf(word.charAt(i));
				res +=get.charAt(index+1);
				
			}
		}
		System.out.println(res);
		
	}

}
