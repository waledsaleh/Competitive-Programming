package Main;

import java.io.IOException;
import java.util.*;
public class TC_364 {
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
	
	System.out.println(decrypt(new String[]	

			{"O ---",
			 "S ...",
			 "B -...",
			 "T -",
			 "R .-.",
			 "E .",
			 "N -.",
			 "X -..-",
			 "D -.." }
 , "-... --- ... - --- -. .-. . -.. ... --- -..-"));
	
		
}
   static	String decrypt(String[] library, String message)
   {
  	 Hashtable<String,String>ht = new Hashtable<String,String>();
	 
  	 for(int i = 0 ; i < library.length;++i)
  	 {
  		 String[] split = library[i].split(" ");
  		 ht.put(split[1], split[0]);
  		 
  	 }
	 String[] split_msg = message.split(" ");
	 String res ="";
	 for(int i  = 0 ; i < split_msg.length;++i)
	 {
		 String get = ht.get(split_msg[i]);
		 if(get==null)res +='?';
		 else
			 res +=get;
	 }
  	 return res;
   }
 
 
 
}