package Main;
import java.util.*;
import java.math.*;

public class TC_312 {

	public static void main(String[] args) {
                   
		            
		            System.out.println(nameThisNumber(10));
		      
		       
	}
  static  String nameThisNumber(int x)
  {
	  String[] all={"unu", "du", "tri", "kvar", "kvin", "ses", "sep", "ok", "nau", "dek"};
	  String num = ""+x;
	      if(x <= 10)return all[x-1];
		  if(x<=20)return "dek"+" "+all[(num.charAt(1)-'0')-1];
		  if(x%10==0)return all[(num.charAt(0)-'0')-1]+"dek";
	
	    return all[(num.charAt(0)-'0')-1]+"dek "+""+all[(num.charAt(1)-'0')-1];
		  
  }
  
  
  
}
