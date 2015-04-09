package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class UVA_324 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);

              while(true)
              {
            	  int n = sc.nextInt();
            	  
            	  if(n==0)break;
            	  
            	  BigInteger f = fact(n);
            	  int count_0 = 0,
            			  count_1 = 0,
            			  count_2 = 0,
            			  count_3 = 0,count_4 = 0,count_5 = 0,count_6 = 0,count_7 = 0,count_8 = 0,count_9 = 0;
            	  
            	  String q = f.toString();
            	 // int[] array = new int[2000];
            	  for(int i = 0 ; i <q.length();++i)
            	  {
            		   if(q.charAt(i)=='0')
                		  count_0++;
            		  
            		   else if(q.charAt(i)=='1')
                		  count_1++;
            		  else if(q.charAt(i)=='2')
                		  count_2++;
            		  else if(q.charAt(i)=='3')
                		  count_3++;
            		  else if(q.charAt(i)=='4')
                		  count_4++;
            		  else if(q.charAt(i)=='5')
                		  count_5++;
            		  
            		  else if(q.charAt(i)=='6')
                		  count_6++;
            		  
            		  else if(q.charAt(i)=='7')
                		  count_7++;
            		  
            		  else if(q.charAt(i)=='8')
                		  count_8++;
            		  else if(q.charAt(i)=='9')
                		  count_9++;
            		  
            		  
            	  }
            	  /*   (0)    0    (1)    0    (2)    0    (3)    0    (4)    0
   (5)    0    (6)    1    (7)    0    (8)    0    (9)    0  */
            	  System.out.println(n+"! --");
            	 System.out.println("   (0)    "+count_0+"    (1)    "+count_1+"    (2)    "+count_2+"    (3)    "+count_3+"    (4)    "+count_4);
            			 System.out.println("   (5)    "+count_5+"    (6)    "+count_6+"    (7)    "+count_7+"    (8)    "+count_8+"    (9)    "+count_9);
            	  
            	  
              }
              
	}
	
public static BigInteger fact(int n)
{
	if(n==0)return BigInteger.ONE;
	BigInteger f = BigInteger.ONE;
	for(int i = 2 ; i <=n;++i)
		f=f.multiply(BigInteger.valueOf(i));
	
	return f;
}
}
