package Main;

public class TC_682 {

	public static void main(String[] args) {
		
		System.out.println(longestDNASequence("TOPBOATER-WALED"));
		
		
	}
	public static int longestDNASequence(String sequence)
	{
		int countChar=0,max=0;
		for(char ch : sequence.toCharArray()){
			if(ch=='A'||ch=='T'||ch=='C'||ch=='G')countChar++;
			else countChar=0;
				
			max = Math.max(countChar, max);
		}
		
		//Another solution using regular expression
		/*
		String[] split = sequence.replaceAll("[^ACGT]", " ").split(" ");
		int max = 0;
		for(String j : split)if(!j.equals(" "))max = Math.max(j.length(), max);
			*/
		return max;
		
	}
}
