package Main;

public class TC_564 {

	public static void main(String[] args) {

		System.out.println(classifyIt("AAAAANNAA"));
		
	}
	
 static String classifyIt(String word)
   { 
	 if(palin(word))return  "PALINDROME";
	 
	
   	  String res = "";
 	  for(int  i=0 ; i<word.length();)
 	  {
 		res +=word.charAt(i);
 				char c =word.charAt(i);
 				while(i<word.length()&&word.charAt(i)==c)i++;
 		  
 	  }
 	 if(palin(res))return  "FAUX";
 	 
   	  return "NOT EVEN FAUX";
	 
   }
  static boolean palin(String w)
  {
	  int low=0,high=w.length()-1;
	  while(low<=high)
	  {
		  if(w.charAt(low)!=w.charAt(high))return false;
		  low++;high--;
	  }
	  return true;
  }
 
}
