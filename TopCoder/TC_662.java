package Main;
import java.util.*;
import java.math.*;
public class TC_662 {

	public static void main(String[] args) {

		System.out.println(decode(258));
		
	}
	
static String decode(long ciphertext)
{
      
	BigInteger num = new BigInteger(String.valueOf(ciphertext),10);
	String res = num.toString(16);
	res = res.replace("0", "O").replace("1", "I").toUpperCase();
	 if(res.matches(".*\\d.*"))return "Error!";
	
	   return res;
	 
}

}
