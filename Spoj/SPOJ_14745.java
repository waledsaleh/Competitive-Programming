package Main;

import java.util.Scanner;

public class SPOJ_14745 {

	static String res ="";
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		   
		while(sc.hasNext())
		{
	     rev(sc.nextInt());
	  	res=remove(res);
	     System.out.println(res);
	     res="";
		}
		
	}
	public static void rev( int n )
	{
		if(n==0)return ;
		
		res +=(n%10);
		
		 rev(n/10);
		
	} 
  public static String remove(String zero)
  {
	  while(zero.charAt(0)=='0')
	  {
		  zero = new StringBuilder(zero).deleteCharAt(0).toString();
		  
	  }
	  res = zero;
	  return res;
  }
}
