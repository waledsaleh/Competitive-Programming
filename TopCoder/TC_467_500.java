package Main;

public class TC_467_500 {


	public static void main(String[] args) {

		int sum =0;
		System.out.println(sup(14,14,sum));
		
		
		
	}
   public static int sup(int k,int n,int sum)
   {
	   if(k==0)
	   {
		   return n;
	   }
	   sum =0;
	 for(int i =1 ; i <=n;++i)sum +=sup(k-1,i,sum);
	    
	   return  sum;
   }
}
