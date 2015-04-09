package Main;

import java.util.Scanner;

public class CF_454C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
	double rem=1.0;
	double cur_exp=0;
	
	for(int i = m ; i >0;--i)
	{
		double not_app=Math.pow((m*1.0-1)/m, n);
		double app = 1.0-not_app;
		app *=rem;
		
		cur_exp +=app*i;
		rem -=app;
		m--;
	}
		System.out.println(cur_exp);
	}

}
