package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CF_443A {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		if(word.charAt(0)=='{'&&word.charAt(1)=='}')System.out.println(0);
		else
		{
		int index = word.indexOf('{');
		String res = "";
		HashSet<String>set = new HashSet<String>();
		for(int i = index+1;i<word.indexOf('}');++i)
		{
			res +=word.charAt(i);
		}
		res +=',';
		String[]split = res.split(" ");
		
		for(int i = 0 ; i < split.length;++i)set.add(split[i]);
		
		if(set.size()>0)
		System.out.println(set.size());
		else
			System.out.println(0);
		
		}
	}

}
