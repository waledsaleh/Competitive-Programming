package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class LA_3594 {

	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		while(!(line=br.readLine()).equals("#"))
		{
			int res =1;
			for(int i =1 ; i <=line.length();++i)
			{
				if(Character.isUpperCase(line.charAt(i-1)))
				res +=(line.charAt(i-1)-'A'+1)*i;
			}
			System.out.println(res-1);
		}
		
		
	}
	
}
