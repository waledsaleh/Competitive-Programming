package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//A - Bear and Raspberry 
public class CF_385A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int c = sc.nextInt();
	int[] array = new int[n];
	int res=0;
	for(int i = 0 ; i <n;i++)array[i]=sc.nextInt();
	
	for(int i = 1 ; i <n;i++)
	{
	  
		  res =Math.max(res, array[i-1]-array[i]-c);
		
	}
	System.out.println(res);
	
	}
	
}
