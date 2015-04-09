package Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TC_244_500 {

	public static void main(String[] args) {
		 
		  Scanner sc = new Scanner(System.in);
		  
		  
	}
 static int phone(String phone)
 {
	 String pad = "123456789*0#";
    int res =0;
    int x =1,y=1;
	   for(int i = 0 ; i < phone.length();++i)
	   {
		   int index = phone.indexOf(phone.charAt(i));
		   int row = index/3;
		   int col =index % 3;
		   res +=Math.abs(x-row)+Math.abs(y-col);
				   x =row;
		   y = col;
	   }
	   return res;
 }
 
}
