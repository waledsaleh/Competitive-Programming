package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UVA_10063 {
	
	public static void main(String[] args) throws IOException {
     
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Scanner sc= new Scanner(System.in);
	String line;
	boolean end=false;
	while((line=br.readLine())!=null)
	{
		
		//System.out.println(line.length());
	if(end){System.out.println();end=false;}
	List<String>l =allPerms(line.toCharArray());
	for(String j : l)System.out.println(j);
	end=true;
	
	}
	
	
	}
 
	public static List<String> allPerms(char[] array) {    
		  List<String> perms = new ArrayList<String>();
		  if(array.length<=1 )
		      perms.add(String.valueOf(array[0]));
		  else{
		      char[] newarray = Arrays.copyOf(array, array.length-1);
		      char lastChar = array[array.length-1];
		      List<String> list = allPerms(newarray);
		      for(int i=0; i<list.size(); i++) {       
		          String curr = list.get(i);
		          for(int j=0;j<array.length;j++){
		              StringBuffer buff = new StringBuffer(curr);
		              perms.add(buff.insert(j, lastChar).toString());                 
		          }
		      }       
		    }
		return perms; 
		
	}
 
 
}
