package Main;

public class TC_166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    System.out.println(pictureFrames(new int[]{1,2,3,4,5}));
		
	}

	static int pictureFrames(int[] pieces)
	{
	   int count =0;
		if(pieces.length==1||pieces.length==2)return 0;
		
	   for(int i = 0 ; i < pieces.length-2;++i)
	   {
		   for(int j =i+1 ; j < pieces.length-1;++j)
		   {
			  
			   for(int k = j+1 ; k < pieces.length;++k)
			   {
				   if(pieces[i]+pieces[j]>pieces[k] && pieces[i]+pieces[k]>pieces[j]&&
						   pieces[k]+pieces[j]>pieces[i])
				   {
					   count++;
				   }
			   }
		   }
		   
	   }
	   
		return count;
		
	}
	
	
}
