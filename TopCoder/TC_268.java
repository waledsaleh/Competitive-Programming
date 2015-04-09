package Main;

public class TC_268 {

	public static void main(String[] args) {

		System.out.println(countWords(new String[]	

			 	

				{".....X....X....",
				 ".....X....X....",
				 "..........X....",
				 "....X....X.....",
				 "...X....X....XX",
				 "XXX...X....X...",
				 ".....X....X....",
				 ".......X.......",
				 "....X....X.....",
				 "...X....X...XXX",
				 "XX....X....X...",
				 ".....X....X....",
				 "....X..........",
				 "....X....X.....",
				 "....X....X....."}
, 3));
		
	}
  static int countWords(String[] board, int size)
  {
	  int count =0,res=0;
	  for(int i = 0; i <board.length;++i)
	  {
		  count=0;
		  for(int j =0; j <board[i].length();++j)
		  {
			  if(board[i].charAt(j)=='X')
			  {
				  if(count==size)res++;
				  count =0;
				  
			  }
			  else
				  count++;
			  
		  }
		  if(count==size)res++;
	  }
	  return res;
	  
  }
  
}
