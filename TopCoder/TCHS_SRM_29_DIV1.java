package Main;
public class TCHS_SRM_29_DIV1 {

	public static void main(String[] args) {

		
	System.out.println(getSum(1325));
		
		
		
	}
	
	
 static  int getSum(int N)
 {
	 int rSum=0,currSum=N;
	
	 while(N != 0){rSum =rSum *10+ (N % 10); N /=10;}
	
	 return currSum+rSum;
	 
	 
 }
 
 
 
 
}
