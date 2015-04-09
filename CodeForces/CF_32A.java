package Main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CF_32A {
	
static int count =1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
int n = sc.nextInt();
long d = sc.nextLong();
  int count =0;
  long[] array  = new long[n];
for(int i = 0 ; i <n ;++i)array[i]=sc.nextLong();
	
Arrays.sort(array);

	for(int i = 0 ; i <n;++i)
	{
		for(int j = i+1 ; j <n ;++j)
		{
			if(Math.abs(array[i]-array[j])<=d)count++;
		}
	}

  count +=count;
	
  System.out.println(count);
	
	}

}