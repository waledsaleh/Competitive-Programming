package Main;

public class TC_452 {

	public static void main(String[] args) {

	
	System.out.println(minCartons(10));	
	 
	 
	
	}

	
	static  int minCartons(int n) {
		
		int res = Integer.MAX_VALUE,total =0;
		
		for(int i = 0 ; i <= n ; ++i ) {
			for(int j  = 0 ; j <= n; ++j){
				
				 total = i * 6 + j * 8;
				if(total == n) res = Math.min(res, i + j);
				
			}
		}
		
		 return res == Integer.MAX_VALUE ? -1 : res;
	}
}
