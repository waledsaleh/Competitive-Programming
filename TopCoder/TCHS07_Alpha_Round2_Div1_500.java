package Main;

public class TCHS07_Alpha_Round2_Div1_500 {

	public static void main(String[] args) {

		System.out.println(toDigits("--**---**---**---*******--****--***-**"));
		
		
	} 
	static String toDigits(String raw)
	{
		String[] split = raw.replaceAll("[*]+"," ").trim().split(" ");
		String res ="";
		if(split.length==7)
		{
	res  = ""+split[0].length()%10+split[1].length()%10+split[2].length()%10+"-"+
			split[3].length()%10+split[4].length()%10+"-"+split[5].length()%10+split[6].length()%10;
		}
		else
		{
			res ="+";
			for(String j : split)res +=j.length()%10;
		}
		
		return res;
	}

}
