package Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LA_3093 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int test = sc.nextInt();
		while(test-->0)
		{
			String res = "";
			String line = sc.next();
			for(int i =0 ; i<line.length();i +=8)
			{
				String sub =line.substring(i,i+8);
				
				res +=((i==0)?Integer.parseInt(sub,2):"."+Integer.parseInt(sub,2));
				
			}
		System.out.println(res);
		
		
		}
		
	}
	
}
