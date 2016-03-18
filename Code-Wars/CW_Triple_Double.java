package Main;

public class CW_Triple_Double
{
	
	//Link : http://www.codewars.com/kata/55d5434f269c0c3f1b000058/train/java
  public static int TripleDouble(long num1, long num2) 
  {
    int[] occ1 = new int[10],occ2=new int[10];
		for(long i = 0;num1 !=0;num1 /=10){i = num1 % 10;occ1[(int)i]++;}
		for(long i = 0;num2 !=0;num2 /=10){i = num2 % 10;occ2[(int)i]++;}
	    
		for(int i=0;i<occ1.length;++i)
			if( occ1[i]>=3 && occ2[i]>=2)return 1;
			
	   
	    return 0;
  }
}