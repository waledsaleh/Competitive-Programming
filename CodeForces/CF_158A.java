package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_158A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int n ,k;
	n = sc.nextInt();
	k=sc.nextInt();
	int[] array = new int[n];
	int count=0;
	for(int i = 0 ; i <n;++i)
	{
		array[i]=sc.nextInt();
		if(array[i]>=array[k-1]&&array[i]>0)
		{
			count++;
		}
	}
	System.out.println(count);
	
	
	}
	
	
}
