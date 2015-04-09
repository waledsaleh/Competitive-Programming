package Main;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class CF_519A {
 
	public static void main(String[] args) {
//the queen is represented is 'Q', the rook — as 'R', the bishop — as'B', the knight — as 'N',
		//the pawn — as 'P',
		//the king — as 'K'.

//The black pieces are denoted as 'q', 'r', 'b', 'n', 'p', 'k', respectively. 

	  Scanner sc = new Scanner(System.in);	
	 int sum1=0,sum2=0;
		 for(int i = 0; i <8 ;++i)  
		 {
			 String word = sc.next();
			 for(int j = 0 ; j < 8 ; j++)
			 {
				 if(word.charAt(j)=='Q')sum1 +=9;
				 if(word.charAt(j)=='R')sum1 +=5;
				 if(word.charAt(j)=='B')sum1 +=3;
				 if(word.charAt(j)=='N')sum1 +=3;
				 if(word.charAt(j)=='P')sum1 +=1;
				 if(word.charAt(j)=='K')sum1 +=0;
				 
				 if(word.charAt(j)=='q')sum2 +=9;
				 if(word.charAt(j)=='r')sum2 +=5;
				 if(word.charAt(j)=='b')sum2 +=3;
				 if(word.charAt(j)=='n')sum2 +=3;
				 if(word.charAt(j)=='p')sum2 +=1;
				 if(word.charAt(j)=='k')sum2 +=0;
				 
			 }
		 }
		 if(sum1>sum2)System.out.println("White");
		 else if(sum2 > sum1)System.out.println("Black");
		 else
			 System.out.println("Draw");
		  
	}

	
}
