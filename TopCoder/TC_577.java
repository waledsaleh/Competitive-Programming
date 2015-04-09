package Main;

public class TC_577 {
	
	public static void main(String[] args) {
		
		System.out.println(getLength("ayayayayayaya"));
		
		
	}
	static int getLength(String nickname)
	{
		int count =0;
		String res = "";
	
		for(int i = 0 ; i < nickname.length();++i)
		{
			if(nickname.charAt(i)=='e'||nickname.charAt(i)=='i'||nickname.charAt(i)=='o'||
					nickname.charAt(i)=='u'||nickname.charAt(i)=='y'||nickname.charAt(i)=='a')
			{
				count++;
				if(count==1)res +=nickname.charAt(i);
			}
			else
			{
				count =0;
				res +=nickname.charAt(i);
						
			}
			
		}
		return res.length();
		
	}

}
