package Main;

import java.util.Scanner;

public class CF_937B {


	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt(),y = sc.nextInt();
		
	
	for(int i =y ; i > x ;--i){
		
		if(primeCheck(i,x)){
			System.out.println(i);
			return;
		}
		
	}
		
		System.out.println(-1);


	}

	public static boolean primeCheck(int x,int y){
		
		for(int  i = 2 ; i*i <= x && i <= y;++i)if(x % i == 0)return false;
		
		
		return true;
	}
	
	

}
