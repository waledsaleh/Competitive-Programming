package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_69A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int count=0;
	int[][] array;
	int n = sc.nextInt();
	 array = new int[n][3];	
	
	   	for(int i = 0 ; i <n;i++)
	   		for(int j = 0 ; j <3;j++)
	   			array[i][j]=sc.nextInt();
	
	
	for(int i = 0 ; i <3;i++){
		if(count<0||count>0)break;
   		for(int j = 0 ; j <n;j++)
   		{
   			count +=array[j][i];
   			
   		}
	}
   	
	if(count==0)
	{
	System.out.println("YES");	
	}
	else
		System.out.println("NO");
	
	}
	
}
