package Main;

public class TCHS_35_DIV1{

	public static void main(String[] args) {

		
		System.out.println(popularInitial(new String[]{"ANN", "BOB", "JAMES"}
		, 5));
		
		
		
	}
	
static String popularInitial(String[] names, int k)
{ 
	char res=' ';
      int[] arr = new int[91];
	  int max =-1;
      for(int i = 0; i < names.length;++i)
      {
    	  if(k<=names[i].length())
    	  {
    		  arr[names[i].charAt(k-1)]++;
    		if(arr[names[i].charAt(k-1)]>max)
			{
				max = arr[names[i].charAt(k-1)];
				res =names[i].charAt(k-1);
			}
			else if(arr[names[i].charAt(k-1)]==max)
			{
				if(names[i].charAt(k-1)<res)
				{
					res = names[i].charAt(k-1);
				}
			}
    	  }
    	  
      }
	

	return String.valueOf(res);
}

}
