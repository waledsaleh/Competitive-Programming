package Main;

import java.util.Scanner;
import java.io.*;
public class TC_505 {

	public static void main(String[] args) throws IOException {

		Scanner sc= new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(fixCaps("not really. english. qwertyuio. a. xyz."));
		
	}
	static String fixCaps(String paragraph)
	{
		boolean check = true;
		char[] ch =paragraph.toCharArray();
		for(int i = 0 ; i < ch.length;++i)
		{
			if(Character.isAlphabetic(ch[i])&&check)
			{
				ch[i]=Character.toUpperCase(ch[i]);
				check =false;
			}
			if(ch[i]=='.')check =true;
		}
		String res="";
		for(int i = 0 ; i < ch.length;++i)res +=ch[i];
		
	
		return res;
		
	}
}
