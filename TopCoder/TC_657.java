package Main;

import java.util.Scanner;

public class TC_657 {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
   
     
     System.out.println(isCorrect(new String[]{
    		 "R.......",
    		 ".R......",
    		 "..R.....",
    		 "...R....",
    		 "....R...",
    		 ".....R..",
    		 "......R.",
    		 ".......R"}));
     
     
     
	}

	 static String isCorrect(String[] board)
	 {
		 int rowC=0,colC=0,curr=0;
		 
		 for(int i = 0 ; i <8;++i)
		 {
			 rowC=0;colC=0;
			 for(int j =0 ; j<8;++j)
			 {
				 if(board[j].charAt(i)=='R'){rowC++;curr++;}
			
			 }
			 
			 for(int j =0 ; j<8;++j)
			 {
				 if(board[i].charAt(j)=='R'){colC++;}
			 } 
			 
			 if(rowC>1||colC>1||(rowC==0&&colC==0))return "Incorrect";
		 }
		
	if(curr==8)return "Correct";
	return "Incorrect";
	
}
}
