package Main;

public class TC_396 {

	public static void main(String[] args) {

		
		System.out.println(checkDigits("999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"));
		
		
	}
static 	String checkDigits(String cardNumber)
{
	int sum =0;
	int len = cardNumber.length();
	
	sum = (len&1) == 0 ? calc(cardNumber, 0,1) : calc(cardNumber, 1,0);
	
	return ( sum%10==0 ) ? "VALID": "INVALID";
	
	
}
static int calc(String num,int indx,int indx2)
{
	int sum=0;
	String hold="";
	for(int i =indx,j=indx2;(indx==1)?j<num.length():i<num.length(); i+=2,j += 2)
	{
	 if(i<num.length())
	 {
		 if((num.charAt(i)-'0')*2>=10){
		 hold = ""+(num.charAt(i)-'0')*2;
		 sum +=(hold.charAt(0)-'0')+(hold.charAt(1)-'0');
		 }
		 else
			  sum +=(num.charAt(i)-'0')*2;
	 }
	
	 
	 sum +=num.charAt(j)-'0';
	 
	
	}
	
	return sum;
	
}

}
