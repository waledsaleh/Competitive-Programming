package Main;

public class TC_246 {

	public static void main(String[] args) {

		String[]s=uniform(new String[]	

{"263C45233 ", " 2364A56", "B273664"});
		
		for(String k : s)System.out.print(k+" ");
		
	}
 static 	String[] uniform(String[] numbers)
 {
    String[] s = new String[numbers.length];	 
	 for(int i = 0; i <numbers.length;++i)
	 {
		 s[i]=  numbers[i].replaceAll(" ", "");
		 s[i] = s[i].replaceAll("\\D+", ".");
		 
	 }
	 return s;
 }
 
}
