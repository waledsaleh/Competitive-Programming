package Main;

public class TC_234{

	public static void main(String[] args) {

		System.out.println(howLong(	

				"AAABBBBAA"));
		
		
	}
  static int howLong(String moves)
  {
	  int max = 0;
	  int counta =1;
	  for(int i=1; i < moves.length();++i)
	  {
		  if(moves.charAt(i)==moves.charAt(i-1)) counta++;
		  else
		  {
			 max = Math.max(max, counta); 
			 counta =1;
		  }
		  
	  }
	   max = Math.max(max, counta);
	   
	  return max;
  }
}
