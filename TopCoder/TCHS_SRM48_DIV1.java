package Main;

public class TCHS_SRM48_DIV1 {

	public static void main(String[] args) {

		
		
		System.out.println(howMany(new String[]{"NYY",
				 "NNY",
		 "NNN"}));
		
		
	}
 static int howMany(String[] friends)
 {
	 
	 int count =0,n=friends.length;
	 
	 for(int i = 0; i < n;++i)
	 {
     for(int j = 0 ; j <n;++j)count +=(friends[i].charAt(j)=='Y'&&friends[j].charAt(i)=='N'?1:0);
		
	 }
	 
	 
	 return count;
 }
}
