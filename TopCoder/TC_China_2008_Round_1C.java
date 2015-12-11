package Main;

public class TC_China_2008_Round_1C {

	public static void main(String[] args) {

		
		System.out.println(matchFiles(new String[]	

				

				{"config.sys", "config.inf", "configures"}));
		
		
		
		
		
	}
 static String matchFiles(String[] filenames)
 {
	 String res = ""; 
	 loop: for(int i = 0 ; i <filenames[0].length();++i)
	 {
		 for(int j = 1;j<filenames.length;++j)
		 {
		 if(filenames[j].charAt(i)!=filenames[0].charAt(i)){res +="?";continue loop;}
			
		 } 
		 
		res +=filenames[0].charAt(i); 
	 }
	 
	 return res;
	 
	 
	 
 }
	
}
 