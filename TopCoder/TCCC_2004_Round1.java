package Main;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
public class TCCC_2004_Round1{
 
	public static void main(String[] args) throws Exception {

		String[] get = getWords("a");
		for(String j : get)System.out.print(j+" ");
	

		
	}
 static String[] getWords(String sentence)
 {
	 List<String>res = new ArrayList<String>();
	 String[] split = sentence.split(" ");
	 
	 for(String word : split)if(word.toLowerCase().matches("[aeiouhlmknpw]+"))res.add(word);
	 
	 
	 return res.toArray(new String[0]);
	 /*Another Solution
	 String newSentence = sentence.replaceAll("[^ aHeEiIoOuUhHlLmMkKnNpPwW]","!");
	 String[] splitLower=newSentence.split(" "),splitOrig=sentence.split(" ");
	 String res ="";
	 
	 for(int i = 0 ; i <splitLower.length;++i)
	 {
		 res +=(i==0 && !splitLower[i].contains("!") ? splitOrig[i]:(!splitLower[i].contains("!")?" "+splitOrig[i]:""));
	 
	 }
	 
	 return (res.length()==0?new String[]{}:(res.charAt(0)==' '?res.substring(1).split(" "):res.split(" ")));
	 
	 */
	 
 }
 
 }


