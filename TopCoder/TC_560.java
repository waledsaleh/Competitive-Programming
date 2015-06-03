package Main;

public class TC_560 {

	public static void main(String[] args) {

		 System.out.println(minDistance("qwertyuiop", "potter"));
		
		
	}
	static int minDistance(String keyboard, String word)
	{
		int res = 0;
		for(int i = 0; i <word.length()-1;++i)
		{
			int in1 = keyboard.indexOf(word.charAt(i));
			int in2 = keyboard.indexOf(word.charAt(i+1));
			res +=(Math.abs(in1-in2));
		}
		return res;
		
		
	}
}
