package Main;

public class TC_187_DIV1_300 {
	
	public static void main(String[] args) {
		
		
		System.out.println(lastCyberword(	

				"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"));
		
		
	}
	 static String lastCyberword(String cyberline)
	 {
		
		 cyberline = cyberline.replace("-", "").replaceAll("[^a-zA-Z0-9@]", " ");
		 
		 String[] split =cyberline.split(" ");
		 
		 return split[split.length-1];
	 }
}
