package Main;

public class TC_199 {

	public static void main(String[] args) {
		
   System.out.println(times("Bow",-5));		

	}

	static String times(String sFactor, int iFactor)
	{
		if(iFactor==0||sFactor.equals(""))return "";
		
		if(iFactor>0)return  str(sFactor,iFactor);
		
		return new StringBuilder(str(sFactor,iFactor)).reverse().toString();
		
	}
	public static String str(String s , int k)
	{
		String res="";
		for(int i = 0 ; i < Math.abs(k);++i)res +=s;
		return res;
	}
}
