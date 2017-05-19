package Main;

import java.util.*;
import java.math.*;

public class TC_698 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		
		
	}
 
	static  String getInitials(String name) {
		String[] split = name.split(" ");
		String res = "";
		for(String word : split)res +=word.charAt(0);
		
		return res;
		
	}
	
	
	
}
