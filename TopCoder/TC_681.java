package Main;

public class TC_681 {

	public static void main(String[] args) {

		
		System.out.println(countCoins("HTT"));
		
		
	}
 static  int countCoins(String state)
 {
	 int count=0;
	 
	 for(int i =0 ; i <state.length();++i)
		 count+=(i!=state.length()-1&&state.charAt(i+1)!=state.charAt(i)||(i!=0&& state.charAt(i-1)!=state.charAt(i))?1:0);
	
	 return count;
	 
 }
}
