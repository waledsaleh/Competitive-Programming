package Main;


//10055 - Hashmat the Brave Warrior

import java.util.InputMismatchException;
import java.util.Scanner;
	public class UVA_10055{
	 
	    public static void main(String[] args) {
      Scanner in=new Scanner (System.in);
      try{
      while(in.hasNext()) // End of file '.'
      {
          long a=in.nextLong();
          long b=in.nextLong();
          if(a>b)
              System.out.println(a-b);
          else
              System.out.println(b-a);
 
      }
      }catch(InputMismatchException e) // Except handle
      {
    	  
      }
    }
}