package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CF_401A {

	
public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		 

		 int n = sc.nextInt();
		 int x = sc.nextInt();
		 int[] array = new int[n];
		 int sum =0;
		 for(int i = 0 ; i <n ;++i)
		 {
			 array[i]=sc.nextInt();
		 sum +=array[i];
		 }
		 int count =0;
		 
		 sum = Math.abs(sum);
		 if(sum%x!=0)count++;
		 
		 System.out.println(count+sum/x);
		 
}


}
