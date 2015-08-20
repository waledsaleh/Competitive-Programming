package Main;

import java.util.regex.*;;

public class TC_349 {

	public static void main(String[] args) {

		
		System.out.println(nonIntersecting(	

new String[]	

{"ababababa"}, "aba"));
		
		
	}
 static  int nonIntersecting(String[] doc, String search)
 {
	 String str ="";
	 for(String j : doc)str +=j;
	 
	 int count =0;
	
	 int pos;
	 while((pos=str.indexOf(search))!=-1)
			 {
		 str = str.substring(pos+search.length());
		 count++;
			 }
	 
	 return count;
 }
 
 
 
 
 
}
