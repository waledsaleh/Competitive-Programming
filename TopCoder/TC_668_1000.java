package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class TC_668_1000 {

	public static void main(String[] args) throws IOException {

	System.out.println(solveProblem(new int[]{31, 1, 3, 7, 2, 5}, 30));
		
	}
	 static int solveProblem(int[] A, int K)
	 {
		
		 int count =0;
		 for(int i = 0; i < A.length;++i)
		 {
			long bg1 = A[i];
			 for(int j = i+1; j<A.length;++j)
			 {
				long bg2 = A[j];
				 for(int k = j+1 ; k <A.length; ++k)
				 {	 
					 
				long bg3 =  A[k];
				long res =(long) ((bg1*bg2%K) * bg3) %K;
	            if(res==0)
	            count++;
	            
				 }
				 
			 }
			 
		 }
		 return count;
		 
	 }
}
