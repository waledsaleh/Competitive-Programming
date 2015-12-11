package Main;
import java.nio.charset.Charset;
import java.util.*;
public class TC_CoderDojo_DIV1 {

	public static void main(String[] args) {

		System.out.println(chooseDinner("ABEDCS", "",""));
		
	}
 static String chooseDinner(String diet, String breakfast, String lunch)
 {
	 String res = "";
	
	 SortedSet<Character> s = new TreeSet<Character>();
	 
	 for(char ch : diet.toCharArray())s.add(ch);
	 
	 for(char ch : breakfast.toCharArray())if(!breakfast.equals("")&&s.contains(ch))s.remove(ch);else return "CHEATER";
	 for(char ch : lunch.toCharArray())if(!lunch.equals("")&&s.contains(ch))s.remove(ch);else return "CHEATER";
	 
	 for(char chRes : new ArrayList<Character>(s))res +=chRes;
	
	 return res;
	
 }
 
 
 
}
