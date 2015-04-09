package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TC_376{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(clearExcess("!!!!!!!!!!!!!!!!?"));
		
		
	}
 static  String clearExcess(String document)
 {
	 int n = document.length();
	 for(int i =0; i  <n;++i)
	 {
		 
	 document = document.replace("!?", "?");
	 document = document.replace("??", "?");
	 document = document.replace("!!", "!");
	 document = document.replace("?!", "?");
		 
	 }
	 return document;
	 
 }
}
