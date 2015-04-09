package Main;

import java.util.Arrays;
import java.util.Scanner;

public class CF_509A {

	public static void main(String[] args) {
		
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  int[][] array = new int[n][n];
  Arrays.fill( array[0], 1);
  for(int i =0 ; i <n;++i) array[i][0]=1;
  
  int max = 1;
  for(int i = 1 ; i <n;++i)
  {
	  for(int j = 1 ; j <n ;++j)
	  {
		  array[i][j]= array[i-1][j]+ array[i][j-1];
		max = Math.max(max, array[i][j]);
	  }
  }
	  System.out.println(max);
		
		
	}

}
