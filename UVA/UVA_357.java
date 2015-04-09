package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_357 {

	public static void main(String[] args) throws  IOException {

		Scanner sc = new Scanner(System.in);
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuffer sb = new StringBuffer("");
	        String m = "";
	        int coins[] = {50,25,10,5,1};
	        long arr[] = count(coins, coins.length, 30000);
	        while ((m = br.readLine()) != null) {
	            int x=Integer.parseInt(m);
	            if(x<5)
	                sb.append("There is only 1 way to produce ").append(x).append(" cents change.\n");
	            else
	                sb.append("There are ").append(arr[x]).append(" ways to produce ").append(x).append(" cents change.\n");
	        }
	        System.out.print(sb);
	    }


		
	
static long[] count(int coins[], int m, int n) {
    long[] temp = new long[n + 1];
    temp[0] = 1;
    for (int i = 0; i < m; i++) {
        for (int j = coins[i]; j < n+1; j++) {
            temp[j] += temp[j - coins[i]];
        }
    }
    return temp;
}

}
