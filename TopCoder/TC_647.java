package Main;

public class TC_647 {

	public static void main(String[] args) {

		
		System.out.println(makeLine(new int[]{1,2,2}));
		
		
	}

	static String makeLine(int[] x){
		
		int occ[] = new int[26];
		
		for(int i = 0 ; i < x.length;  occ[x[i++]]++);
		
		int half = (x.length+1) >> 1;
		
		for(int i = 0 ; i < occ.length;++i)if(occ[i] > half)return "impossible";
		
		
		
		return "possible";
	}
	
}
