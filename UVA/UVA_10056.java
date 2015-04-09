package Main;

import java.util.Scanner;

public class UVA_10056 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Ans=(P(i-P)^i-1)/(1-(1-P)^n);
		
		
		int test =sc.nextInt();
		while(test-->0)
		{
			int n = sc.nextInt();
			double p = sc.nextDouble();
			int player = sc.nextInt();
			
			double max= 0.000001;
			
			double Prob_first= p*Math.pow(1-p, player-1);
			double res=0.0;
			int count =1;
			res = Prob_first;
			while(true)
			{
				double New_prob = Math.pow(1-p, count*n); 
				if(New_prob * Prob_first<max)break;
				else
					res +=New_prob*Prob_first;
				
				++count;
			}
			
			System.out.printf("%.4f\n",res);
			
		}
		
	}

}
