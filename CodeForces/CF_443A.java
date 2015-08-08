package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CF_443A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String word = br.readLine();
		    
		 word= word.replaceAll("(.)(?=.*\\1)", "");
	    word = word.replace("{","").replace(",", "").replace(" ","").replace("}","");
	   
	    
	    System.out.println(word.length());
	}

}
