package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CF_452A {

	public static void main(String[] args) throws IOException {
		String[] s ={"vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
	boolean f= false;
String word = br.readLine();

for(int i = 0 ; i < s.length;++i)
{
	if(s[i].matches(word))
	{
		System.out.println(s[i]);break;
	}
}




	}



}