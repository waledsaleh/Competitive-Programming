package Main;

public class TC_187_DIV1_300 {
	
	public static void main(String[] args) {
		
		
		System.out.println(lastCyberword(	

				"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"));
		
		
	}
	 static String lastCyberword(String cyberline)
	 {
		String res="";
		 cyberline = cyberline.replace("-", "").replaceAll("[^a-zA-Z0-9@\\s]", " ");
		 
		 String[] split =cyberline.split(" ");int n =split.length;
		 for(int i =n-1; i>=0;i--)if(!split[i].equals(" ")){res=split[i];break;}
		
		 return res;
	 }
}
