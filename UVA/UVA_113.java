package Main;



import java.util.Scanner;

//113 - Power of Cryptography uva

public class UVA_113 {

	public static void main(String[] args){
	{
	
		Scanner sc = new Scanner (System.in);
		double hasil;
		while(sc.hasNextDouble()){
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		hasil = Math.pow(c, 1/b);
		System.out.println(Math.round(hasil));
		
	}
	
}

	}
}

