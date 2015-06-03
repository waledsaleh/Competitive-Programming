package Main;

public class TC_214 {

	public static void main(String[] args) {

		System.out.println(expand(	

" _ _ __  _ yabba dabba _   *  dooooo  * ****"));
		
		
		
	}
  static 	String expand(String text)
  {
	  boolean c =false,b=false;
	 
	  String res = "";
	  for(int i = 0 ; i < text.length();++i)
	  {
		if(text.charAt(i)=='_')
		{
		 res +=(!c)?"<i>" : "</i>";
			 c =!c;
		}
		else if(text.charAt(i)=='*')
		{
			 res +=(!b)?"<b>" : "</b>";
			 b =!b;
		}
		else
			res +=text.charAt(i);
		
	  }
	  return res;
	  
  }
  
  
}
