package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_208A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String word = br.readLine().trim();
	word = word.replace("WUB", " ");
	int count =0;
	while(true)
	{
		//word = word.replaceFirst(" ", "");
		if(word.charAt(count)==' ')
		{
		word = word.replaceFirst(" ", "");
		
		}
		else
			break;
	}
	
	
	
	
	StringBuilder sb = new StringBuilder(word);
	
	for(int e = 1 ; e <sb.length();++e)
	{
		if(sb.charAt(e)==' '&&sb.charAt(e-1)==' ')
		sb.deleteCharAt(e);
	}
	//word = word.replaceAll(" ", "");
	System.out.println(sb);

	/*System.out.println(word);
	String[] s = word.trim().split(" ");
	for(int i = 0 ; i <s.length;++i)
	{
		if(s[i]=="")
			s[i]=" ";
	}
	for(String j : s)
	System.out.print(j+" ");
		*/
	
	
	
	

}




}
