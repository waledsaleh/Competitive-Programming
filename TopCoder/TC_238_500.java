package Main;

public class TC_238_500 {

	public static void main(String[] args) {

		
		System.out.println(getOutput(new String[]	

				{"A"}, new String[]{"0 1"} ));
		
		
		
	}
 static String getOutput(String[] threads, String[] slices)
 {
	 String res ="";
	 int c =0;
	 int[] keep = new int [threads.length];
	 for(int i = 0; i <slices.length;++i)
	 {
		 String[] split = slices[i].split(" ");
		 int indStr = Integer.parseInt(split[0]);
		 c=indStr;
		 String thr=threads[indStr];
		 for(int j =1 ; j<= Integer.parseInt(split[1]);++j)
		 {
			 if(keep[c]==thr.length())keep[c]=0;
			 res +=thr.charAt(keep[c]);
			
			 keep[c]++;
		 }
	 }
	 return res;
 }
 
 
}
