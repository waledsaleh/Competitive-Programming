package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//A. Word

public class CF_1 {

	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String s = br.readLine();
	
	StringBuilder sb = new StringBuilder();
	int count_lower=0;
	int count_upper=0;
	
	char[] upper = {'A' ,	'B' 	,'C' 	,'D' ,	'E' ,	'F' ,	'G', 	'H', 	'I' ,	'J' 	,'K','L', 'M',	'N', 	'O', 	'P', 	'Q', 'R' 	,'S' 	,'T' 	,'U' ,	'V' 	,'W' 	,'X' 	,'Y' 	,'Z'};
	
	char[] lower={'a'	,'b'	,'c'	,'d'	,'e'	,'f'	,'g','h'	,'i'	,'j'	,'k'	,'l'	,'m'	,'n','o',	'p'	,'q'	,'r'	,'s'	,'t'	,'u' ,'v'	,'w'	,'x'	,'y',	'z'};
	for(int i = 0; i <s.length();i++)
	{
		
		for(int j=0;j<upper.length;j++)
		{
			if(s.charAt(i)==upper[j])
			count_upper++;
			
		}
		
	}


	for(int i = 0 ; i <s.length();i++)
	{
		
		for(int j=0;j<lower.length;j++)
		{
			if(s.charAt(i)==lower[j])
			count_lower++;
			
		}
		
	}
	String news="";
	
	if(count_lower==count_upper||count_lower>count_upper)
	{
		news=s.toLowerCase();System.out.println(news);
		
	}
	
	 if(count_upper>count_lower)
	{
		 news=s.toUpperCase();
		System.out.println(news);
	
	}
	
	}
	
}
