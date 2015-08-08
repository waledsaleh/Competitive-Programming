package Main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CF_245B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	   String line = sc.next();
		
	   String res = "";
	  
	  
		if(line.charAt(0)=='h')
		{
			res = "http://"+line.substring(4,line.lastIndexOf("ru"))+".ru";
					if(line.lastIndexOf("ru")+2==line.length())	res = "http://"+line.substring(4,line.lastIndexOf("ru"))+".ru";
					else
					res += "/"+line.substring(line.lastIndexOf("ru")+2);
				
			System.out.println(res);
		}
		else
		{
			res = "ftp://"+line.substring(3,line.lastIndexOf("ru"))+".ru";
			if(line.lastIndexOf("ru")+2==line.length())	res = "ftp://"+line.substring(3,line.lastIndexOf("ru"))+".ru";
			else
			res += "/"+line.substring(line.lastIndexOf("ru")+2);
		
			System.out.println(res);
			
			
		}
		
		
	   
	}
	
}
