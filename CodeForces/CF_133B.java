package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class CF_133B {
	public static void main(String[] args) throws IOException, Exception {
		//Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	
	
	String system =br.readLine();
	
	String res ="";
	for(int i = 0 ; i < system.length();++i)
	{
		switch(system.charAt(i))
		{
		case '>':res +="1000";break;
		case '<':res += "1001";break;
		case '+':res += "1010";break;
		case '-' :res += "1011";break;
		case '.' :res += "1100";break;
		case ',' : res += "1101";break;
		case '[':res +="1110";break;
		case ']':res += "1111";break;
		
		}
		
	}
	BigInteger num = new BigInteger(res,2);
	
	System.out.println(num.mod(BigInteger.valueOf(1000003)));
	
	
	/*res *= 16;
    if(s[i]=='>')
        res+=8;
    else if(s[i]=='<')
        res+=9;
    else if(s[i]=='+')
        res+=10;
    else if(s[i]=='-')
        res+=11;
    else if(s[i]=='.')
        res+=12;
    else if(s[i]==',')
        res+=13;
    else if(s[i]=='[')
        res+=14;
    else if(s[i]==']')
        res+=15;
    res %= MOD;
	*/
	
	
	}
	

}
