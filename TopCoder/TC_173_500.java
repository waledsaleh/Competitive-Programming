package Main;

public class TC_173_500 {

	public static void main(String[] args) {
		

		System.out.println(getSequence(	"dyyyZYUYgzYY"));
	

		
		
	}
	
	static  String getSequence(String word)
	{
	    String res = "";	
	    word = word.toUpperCase();
	    char[] ch = new char[]{'A','E','I','O','U'};
	    
	       StringBuilder sb = new StringBuilder("");
	   for(int i = 0 ; i < word.length();++i)
	   {
		  char x = word.charAt(i);
		  boolean f = false;
		  for(int j= 0 ; j < 5 ;++j)
		  {
			  if(x==ch[j])
			  {
				  f=true;
			  }
		  }
		  if(i !=0 && x=='Y'&&sb.charAt(sb.length()-1)=='C')
		  {
			  sb.append("V");
			  continue;
		  }
		  
		  if(f)sb.append("V");
		  else
			  sb.append("C");
		  
	   }
		
	
		for(int i = 1 ; i < sb.length();++i)
		{
			if(sb.charAt(i)==sb.charAt(i-1)){
			sb.deleteCharAt(i);
			i--;
				
			}
		}
		
		return sb.toString();
		
	}
	
	
}
