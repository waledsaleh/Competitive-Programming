package Main;

public class TC_638 {

	public static void main(String[] args) {

		System.out.println(toCamelCase("sum_of_two_numbers"));
		
		
	}
   static  String toCamelCase(String variableName)
   {
	  String[] split = variableName.split("_");
	  String res = ""; 
	  res = split[0];
	  for(int i = 1 ; i <split.length;++i)
	  {
		  char ch = Character.toUpperCase(split[i].charAt(0));
		  res +=ch+""+split[i].substring(1,split[i].length());
		  
	  }
	  return res;
   }
	 
	
}
