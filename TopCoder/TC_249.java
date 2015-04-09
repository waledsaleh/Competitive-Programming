package Main;

public class TC_249 {

	public static void main(String[] args) {
		
		
           System.out.println(howMany(new String[]{
        		   "Bob: This is a long",
        		   "sentence that takes 2 lines.",
        		   "Tim: Yes it is.",
        		   "Bob : I am not Bob.",
        		   "Frank: No you aren't!",
        		   " Bob: Neither am I."
        		   },"Bob"));
		
		
	}
	
   static  int howMany(String[] transcript, String name)
   {
	   
	int count =0;
	

	for(int i = 0; i < transcript.length;++i)
	{
		//if(transcript[i].startsWith(name+":"))count++; Another Solution
		
	    int index = transcript[i].indexOf(":");
	    if(index !=-1)
	    {
	    	String sub = transcript[i].substring(0,index+1);
	    	if(sub.equals(name+":"))count++;
	    }
		
	}
	return count;
	
	
   }
	
}
