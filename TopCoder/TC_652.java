package Main;

public class TC_652 {

	public static void main(String[] args) {

		 System.out.println(findValue("babca"));
		
		
	}
  static int findValue(String s)
  {
	  int sum =0;
	  int[]k = new int[27];
	  for(int i = 0; i < s.length();++i)
	  { 
		  if(k[s.charAt(i)-'a'+1]>0)continue;
		  for(int j = 0 ; j <s.length();++j)
		  {
			  if(s.charAt(j)<=s.charAt(i))
			  {
				  k[s.charAt(i)-'a'+1]++;
			  }
		  }
	  }
	  for(int i = 0; i <s.length();++i)
	  {
		  sum +=(s.charAt(i)-'a'+1)*k[s.charAt(i)-'a'+1];
	  }
	  return sum;
  }
}
