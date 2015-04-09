package Main;

public class TC_329 {

	public static void main(String[] args) {

		
		
		
	}
 
 static String[] encrypt(String[] text) 
 {
    String[] s = new String[text.length];
	 
	 for(int i = 0; i < text.length;++i)
	 {
		 s[i]=text[i];
		 String rep= text[i].replaceAll("[\\daeiou]", "");
		 
		 if(rep.equals(""))continue;
		 s[i]=rep;
		 
	 }
	 return s;
 }
 
}
