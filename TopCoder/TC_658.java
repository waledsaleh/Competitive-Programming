package Main;

public class TC_658 {

	public static void main(String[] args) {

		 System.out.println(equal("aaaaa", "aaaaaa"));
		
		
	}
  static String equal(String s, String t)
  {
	  if(s.equals(t))return "Equal";
	  String newS=s,newT=t;
	 while(true)
	 {
		  if(newS.length()==newT.length()){
			  return (s.equals(t)?"Equal":" Not equal"); 
		  }
		  if(newS.length()<newT.length())newS +=s;
		  else
			  newT +=t;
		   
	 }
	 
  }
 
}
