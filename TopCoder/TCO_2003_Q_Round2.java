package Main;

public class TCO_2003_Q_Round2 {
	
	public static void main(String[] args) {

		
	int[]r = getFreqs(new String[]{ "Be sure to ignore case", "and non-letter characters"});
		
	for(int j : r)System.out.println(j);	
		
	}
	 static int[] getFreqs(String[] doc)
	 {
		 int[] resFreq = new int[26];
		 
		 for(String word : doc)
		 {
			 String pieceWord=word.toLowerCase();
			 for(char ch : pieceWord.toCharArray())if(Character.isLetter(ch))resFreq[ch-'a']++;
		 
		 }
		 
		 
		 return resFreq;
		 
		 
	 }
}
