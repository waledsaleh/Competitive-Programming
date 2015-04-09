package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_448A {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int suma=0,sumb=0;
		for(int i = 0 ; i < 3 ; ++i){ int num  = sc.nextInt(); suma+=num;}
		for(int i = 0 ; i < 3 ; ++i){ int num  = sc.nextInt(); sumb+=num;}
		
		
		int n = sc.nextInt();
		int  m = (suma + 4) / 5 + (sumb + 9) / 10;
		
		if(m> n)
		{
			System.out.println("NO");
			
			
		}
		else
			System.out.println("YES");
		
			
		
	}

}
