package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_618 {
	public static void main(String[] args) throws IOException, Exception {
		//Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	
	
	}
	
	static int write(String word)
	{
		int sum = 0;
        for(int i =0; i < word.length();sum += (word.charAt(i)-'A'+1),++i);
        return sum;
	}
}
