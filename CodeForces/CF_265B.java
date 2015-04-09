package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_265B {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n  = sc.nextInt();
		int[] array = new int[n];
		int ones=0;
		int res =0;
		for(int i = 0 ; i <n;++i)array[i]=sc.nextInt();
	
		 for(int i = 0;  i < n ; ++i)
		 {
			 if(array[i]==1)ones++;
			 if(i>1&&ones>1&&array[i]==1&&array[i-1]==0)
			 {
				 res++;
			 }
		 }
		System.out.println(res+ones);
	}

}
