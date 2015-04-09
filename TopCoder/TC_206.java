package Main;

import java.util.Scanner;

public class TC_206 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
	System.out.println(minBits(1000000));
		
	}
	static int minBits( int n )
	{
		int pow =0;
		while(n>0)
		{
			n=n>>1;
			pow++;
		}
		return pow;
		
	}

}
