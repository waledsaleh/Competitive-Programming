package Main;

public class TC_265 {

	public static void main(String[] args) {

		System.out.println(getPixelWidth("Dead Beef", new int[]{6,6,6,7,7,7,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9}, 
				new int[]{5,5,5,4,4,4,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9}));
		
	}
 static int getPixelWidth(String sentence, int[] uppercase, int[] lowercase)
 {
	
	int res =0;
	for(int i = 0; i < sentence.length();++i)
	{
		if(sentence.charAt(i)>='a'&&sentence.charAt(i)<='z')res +=lowercase[sentence.charAt(i)-'a'];
		else if(sentence.charAt(i)>='A'&&sentence.charAt(i)<='Z')res +=uppercase[sentence.charAt(i)-'A'];
		else
			res +=3;
		
	}
	res +=1*(sentence.length()-1); 
	
	return res;
	
 }
 
}
