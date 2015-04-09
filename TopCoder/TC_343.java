package Main;

public class TC_343 {

	public static void main(String[] args) {

		
		System.out.println(getPersistence(268));
		
	}
 static int getPersistence(int n)
 {
	 if(n<=9)return 0;
	 int count =0;
	 int rem=0,prod=1;
	  while(n > 9)
	  {
		  while(n!=0)
		  {
		  rem = n%10;
		  prod *=rem;
		  n /=10;
		  
		  }
		  count++;
		  n=prod;
		  prod =1;
	  }
	 return count;
	 
 }
 
 
 
}
