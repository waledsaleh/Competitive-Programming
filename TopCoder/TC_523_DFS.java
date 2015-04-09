package Main;

import java.util.Arrays;

public class TC_523_DFS {
 
 
	public static void main(String[] args) {

	
		System.out.println(doesItExist(new String[] 	

{"ADEHI..Z",
 "BCFGJK.Y",
 ".PONML.X",
 ".QRSTUVW"}
));
		
		
	}
  static String doesItExist(String[] letterMaze)
  {
	int index1=0,index2=0;
    for(int i =0; i < letterMaze.length;++i)for(int j =0; j <letterMaze[i].length();++j) if(letterMaze[i].charAt(j)=='A'){index1=i;  index2=j;}
	
	int i=index1,j=index2;
	char ch='B';
	while(ch<='Z')
	{
		if(j>0 && letterMaze[i].charAt(j-1)==ch){j--;ch++; continue;}
		if(j<letterMaze[0].length()-1 && letterMaze[i].charAt(j+1)==ch){j++;ch++; continue;}
		if(i>0 && letterMaze[i-1].charAt(j)==ch){i--;ch++; continue;}
		if(i<letterMaze.length-1 && letterMaze[i+1].charAt(j)==ch){i++;ch++; continue;}
		
		return "NO";
	}
	  
	return "YES";
	
  }
 
  
}
