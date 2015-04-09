package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_12502 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int test=sc.nextInt();int x=0,y=0,z=0;
	while(test-->0)
	{
		x= sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		int res = z*(x+(x-y))/(x+y) ;
		
		System.out.println(res);
		
	}
	
	}
}
