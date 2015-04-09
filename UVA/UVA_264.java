package Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UVA_264 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		 while (sc.hasNext()) {
	            int num = sc.nextInt(),index=num,count=0;

	            for (count=1; index>count; count++)  index-=count;

	              
	            int nomirator =  count%2==0 ? index  : count-index+1;
	            int donimator = count-nomirator+1;

	            System.out.printf("TERM %d IS %d/%d\n", num, nomirator,donimator);
	        }
	
	}
  public static int GCD(int i , int j)
  {
	  if(i==0||j==0)return i+j;
	  return GCD(j,i%j);
  }
}
