package Main;

import java.util.Scanner;

public class CF_501A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
		
		int max1 =Math.max((3*a)/10, a-(a/250)*c); 
		
		int max2 =Math.max((3*b)/10, b-(b/250)*d); 
		if(max1==max2)System.out.println("Tie");
		else if(max1>max2)System.out.println("Misha");
		else
			System.out.println("Vasya");
		
	}

}
