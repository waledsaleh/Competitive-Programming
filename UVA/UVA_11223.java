package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_11223 {
	public static HashMap<String, String> startMap() {
		HashMap<String, String> result = new HashMap<String, String>();
		result.put(".-", "A");                                                                               
		result.put(".---", "J");                                                                             
		result.put("...", "S");                                                                              
		result.put(".----", "1");                                                                            
		result.put(".-.-.-", ".");                                                                           
		result.put("---...", ":");                                                                           
		result.put("-...", "B");                                                                             
		result.put("-.-", "K");                                                                              
		result.put("-", "T");                                                                                
		result.put("..---", "2");                                                                            
		result.put("--..--", ",");                                                                           
		result.put("-.-.-.", ";");                                                                           
		result.put("-.-.", "C");                                                                             
		result.put(".-..", "L");                                                                             
		result.put("..-", "U");                                                                              
		result.put("...--", "3");                                                                            
		result.put("..--..", "?");                                                                           
		result.put("-...-", "=");                                                                            
		result.put("-..", "D");                                                                              
		result.put("--", "M");
		result.put("...-", "V");
		result.put("....-", "4");
		result.put(".----.", "'");
		result.put(".-.-.", "+");
		result.put(".", "E");
		result.put("-.", "N");
		result.put(".--", "W");
		result.put(".....", "5");
		result.put("-.-.--", "!");
		result.put("-....-", "-");
		result.put("..-.", "F");
		result.put("---", "O");
		result.put("-..-", "X");
		result.put("-....", "6");
		result.put("-..-.", "/");
		result.put("..--.-", "_");
		result.put("--.", "G");
		result.put(".--.", "P");
		result.put("-.--", "Y");
		result.put("--...", "7");
		result.put("-.--.", "(");
		result.put(".-..-.", "\"");
		result.put("....", "H");
		result.put("--.-", "Q");
		result.put("--..", "Z");
		result.put("---..", "8");
		result.put("-.--.-", ")");
		result.put(".--.-.", "@");
		result.put("..", "I");
		result.put(".-.", "R");
		result.put("-----", "0");
		result.put("----.", "9");
		result.put(".-...", "&");
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(sc.nextLine());
		int cases = sc2.nextInt();
		HashMap<String, String> map = startMap();
		for (int i = 1; i <= cases; i++) {
			System.out.printf("Message #%d\n", i);
			char[] cs = sc.nextLine().toCharArray();
			String word = "";
			StringBuilder sb = new StringBuilder();
			for (char c : cs) {
				if (c == ' ') {
					if (!word.trim().equals("")) {
						sb.append(map.get(word.trim()));
						word = " ";
					} else {
						if (word.equals("")) {
							word = " ";
						} else {
							sb.append(" ");
							word = "";
						}
					}
				} else {
					if (word.equals(" ")) {
						word = "";
					}
					word += c;
				}
			}
			if (!word.trim().equals("")) {
				sb.append(map.get(word));
			}
			System.out.println(sb.toString());
			if (i != cases)
				System.out.println();
		}
	}

	

	
}
