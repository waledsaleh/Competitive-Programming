package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class TC_324_500 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println(decode("Misip",new int[]{2,3,1,7},new int[]{1,1,2,2}));
		
	}
	static String decode(String code, int[] position, int[] length)
	{
	
		String sub = "";
		StringBuilder sb = new StringBuilder(code);
		for(int i = 0 ; i < position.length;++i)
		{
			sub = sb.substring(position[i],position[i]+length[i]);
			sub = new StringBuilder(sub).reverse().toString();
			sb.insert(position[i]+length[i], sub);
			
		}
		return sb.toString();
		
	}

}
