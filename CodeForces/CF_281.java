package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_281 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String word =br.readLine();
	String res = "";String e ="";
	String fin="";String w ="";
	
	if(!(Character.isUpperCase(word.charAt(0))))
	{
		char c = word.charAt(0);
		res =c+"";
		e=res.toUpperCase();
		
		w=String.valueOf(c);
		fin = word.replaceFirst(w, e);
		
		System.out.println(fin);
	}
	else
		System.out.println(word);
	
	}

}
