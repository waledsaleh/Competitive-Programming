package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_256 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int n = 10;
	int[] row = new int[n];
	int[] col = new int[n];//{1,4,1,0,3};
	for(int i = 0 ; i <row.length;++i)row[i]=sc.nextInt();
	for(int i = 0 ; i <col.length;++i)col[i]=sc.nextInt();
	
	 System.out.println( generate(row,col));
	
	//print(s);
	
	}
	
	public static int generate(int[]row , int[] col)
	{
		
		int sum=0;
		int[][]array = new int[row.length][col.length];
		
		for(int i = 0 ; i <row.length;++i)array[0][i]=row[i];
		
		
		for(int i = 0 ; i <col.length;++i)array[i][0]=col[i];
		
		int count =0;
		
		for(int i = 1 ,j=1;i<array.length;)
		{
			array[i][j]=array[i-1][j]+array[i-1][j-1]+array[i][j-1];
			j++;
			
			if(j==array.length)
			{
				count =0;
				j=1;
				i++;
			}
			count++;
		}
		
		sum = array[array.length-1][array.length-1];
		
		return sum;
		
		
	}
	public static void print(int[][]r)
	{
		for(int i = 0 ; i <r.length;++i)
		{
			for(int j = 0 ; j <r[i].length;++j)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}
}
