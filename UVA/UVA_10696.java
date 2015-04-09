package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_10696 {

	
	//10696 - f91 uva
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	String n ;
	while(!(n=br.readLine()).equals("0"))
		
	{
	
	
	System.out.println("f91"+"("+(n)+") "+"= "+((Integer.parseInt(n)>100)?Integer.parseInt(n)-10:91));
	
	
	
	
	}
	
	}
	
	
	
	
}
