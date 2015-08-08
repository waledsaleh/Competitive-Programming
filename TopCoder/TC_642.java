package Main;

public class TC_642 {

	public static void main(String[] args) {

		System.out.println(minNumber("2+2"));
		
		
	}
 static	int minNumber(String expression)
 {
	 expression = expression.replace("+", "");
	 int min=Integer.MAX_VALUE;
	 int res=0,res2=0;
	 int i=0,j=i+1;
	 for(; j <expression.length();++j)
	 {
		 String f = expression.substring(i,j);
		  res = Integer.parseInt(f);
		 
		  String sec = expression.substring(j);
		 res2 =Integer.parseInt(sec); 
			 
		min = Math.min(min, res2+res); 
	 }
	 
	 return min;
 }
 
}
