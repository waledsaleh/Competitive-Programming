package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_635 {

	public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 System.out.println(check("a","t"));
		   
            
		
	}
 static String check(String s, String t)
 {
	 
	if(isSubsequence("asdasddasd", "abcdefgetf"))
	         return "Yep, it's wood.";	      
	     
	         return "Nope.";
	 
	   
 }
 public static boolean isSubsequence(String s, String t) {
	    int M = s.length();
	    if(M == 0)
	    	return true;
	    
	    int N = t.length();
	    
	    if(M > N)
	    	return false;

	    if(s.charAt(0) == t.charAt(0))
	    	return isSubsequence(s.substring(1), t.substring(1));
	    return isSubsequence(s, t.substring(1));
	}

}