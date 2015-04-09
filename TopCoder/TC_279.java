package Main;

public class TC_279{

	public static void main(String[] args) {

		   System.out.println(makeDancing("This is a dancing sentence"));
		
	}
	 static String makeDancing(String sentence)
	 {
		 StringBuilder sb = new StringBuilder();
		
		boolean f1=true;
		
		 for(int i = 0; i < sentence.length();i++)
		 {
			if(sentence.charAt(i)!=' ')
			{
				sb.append(f1 ? Character.toUpperCase(sentence.charAt(i)):
					Character.toLowerCase(sentence.charAt(i)));
				f1 = !f1;
				
			}
			else
				sb.append(' ');
			 
			 
		 }
		 
		 return sb.toString();
	 }
}
