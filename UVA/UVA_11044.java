package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class UVA_11044 {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n-->0)
	{
		int r = sc.nextInt();
		int m = sc.nextInt();
		
		r = r/3;
		m = m/3;
		
		System.out.println(m*r);
	}
		
	}
		
	
	
}
