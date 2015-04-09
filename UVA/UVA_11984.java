package Main;

//11984 - A Change in Thermal Unit

import java.io.IOException;
import java.util.Scanner;

public class UVA_11984 {

	
	public static void main(String[] args) throws IOException {

	
		Scanner sc = new Scanner(System.in);
		
		int x , y,t=sc.nextInt();
		for(int i =1 ; i <=t;i++)
		{
			
		x=sc.nextInt();y=sc.nextInt();
		System.out.printf("Case %d: %.2f\n",i,x+5.0*y/9.0);
			
			
		}
		
		
	}
	
}
