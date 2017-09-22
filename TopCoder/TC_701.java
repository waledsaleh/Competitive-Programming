package Main;

public class TC_701 {

	public static void main(String[] args) {

		
		
		
		
	}
	static String isSquareFree(String s) {

		  for (int i = 0; i < s.length(); ++i) {
		   String word = "" + s.charAt(i);

		   for (int j = i + 1; j < s.length(); ++j) {
		    String after = "" + s.charAt(j);
		    if (word.equals(after))
		     return "not square-free";

		    for (int k = j + 1; k < s.length(); ++k) {
		     
		     after +=s.charAt(k);
		     
		     if (word.equals(after))
		      return "not square-free";
		     
		     
		     
		    }
		    word +=s.charAt(j);
		   }

		  }
		  return "square-free";
		 }
}
