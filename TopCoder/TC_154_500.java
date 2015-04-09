package Main;

import java.io.IOException;

public class TC_154_500 {
	
	public static void main(String[] args) throws IOException {

		
		System.out.println(decoder(	"Gur dhvpx oebja sbk whzcf bire n ynml qbt"));


		
		
	}
	
	static String decoder(String message)
	{
		String res = "";
		
		for(int i = 0 ; i < message.length();++i)
		{
			if(message.charAt(i)>='A'&&message.charAt(i)<='M') res +=(char)(message.charAt(i)-'A'+'N');
			else if(message.charAt(i)>='a'&&message.charAt(i)<='m') res +=(char)(message.charAt(i)-'a'+'n');
			else if(message.charAt(i)>='N'&&message.charAt(i)<='Z') res +=(char)(message.charAt(i)-'N'+'A');
			else if(message.charAt(i)>='n'&&message.charAt(i)<='z') res +=(char)(message.charAt(i)-'n'+'a');
			else if(message.charAt(i)>='0'&&message.charAt(i)<='4') res +=(char)(message.charAt(i)-'0'+'5');
			else if(message.charAt(i)>='5'&&message.charAt(i)<='9') res +=(char)(message.charAt(i)-'5'+'0');
			else
				res +=" ";
			
		}
		return res;
		
		
	}

}
