package Main;

public class TC_665 {

	public static void main(String[] args) {
		
		System.out.println(construct(4));
		

	}
static	int construct(int a)
{
	
	for(int i =a ; i<=100 ;++i)
	{
		if(check(String.valueOf(a ^ i)))
		{
		return i;
			
		}
		
	}
	
	return -1;
	
}
static boolean check (String num)
{
	for(int i = 0; i < num.length();++i)
	{
		if( num.charAt(i) != '4'&& num.charAt(i)!='7')return false;
		
	}
	
	return true;
}


}
