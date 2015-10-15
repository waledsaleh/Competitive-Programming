package Main;
import java.util.*;
import java.math.*;
public class TCO_2005_Div1_250 {

	public static void main(String[] args) {

		System.out.println(add("1+2+3", new String[]{}));
		
		
		
	}
 static  int add (String eq, String[] vars)
 {
	HashMap<String,Integer> hash=  new HashMap<String,Integer>();
	for(String word : vars)hash.put(word.substring(0,word.indexOf(' ')), Integer.parseInt(word.substring(word.indexOf(' ')+1)));
	
	 int sum =0;
	 String[] split = eq.split("\\+");
	for(String sWords : split)
	{
		sum +=(Character.isDigit(sWords.charAt(0))? Integer.parseInt(sWords): hash.get(sWords));
			
		
	}
	return sum;
	
 }
}
