package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CF_160A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int result = 0;int sum=0;
	int[] array = new int[n];
	for(int i = 0 ; i <n;++i){array[i]=sc.nextInt();sum+=array[i];}
Arrays.sort(array);
	
	//int[] r =reverse(array);
	
	
	int c =0;
	for(int i = array.length-1 ; i >=0;--i)
	{
		c += array[i];
		result++;
		if(c>(sum-c))
		{
			break;
		}
	//	result= Math.min(result, array[i]+array[i-1]);
		
	}
	System.out.println(result);
	}
	public static int[] reverse(int[]a)
	{
		int[] res = new int[a.length];
		for(int i = res.length-1;i>=0;i--)
		{
			
			res[i]=a[i];
			
		}
		return res;
	}
}
