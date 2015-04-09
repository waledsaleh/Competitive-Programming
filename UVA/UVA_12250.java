package Main;

import java.util.Scanner;

public class UVA_12250 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word;
		int count =1;
		while(!(word=sc.next()).equals("#"))
		{
			switch(word)
			{
			case "HELLO":
				System.out.println("Case "+count+": ENGLISH");count++;
			break;
			case "HOLA":
				System.out.println("Case "+count+": SPANISH");count++;
				break;
			case "HALLO":
				System.out.println("Case "+count+": GERMAN");count++;
				break;
			case "BONJOUR":
				System.out.println("Case "+count+": FRENCH");count++;
				break;
			case "CIAO":
				System.out.println("Case "+count+": ITALIAN");count++;
				break;
			
			case "ZDRAVSTVUJTE":
				System.out.println("Case "+count+": RUSSIAN");count++;
				break;
				default : System.out.println("Case "+count+": UNKNOWN");count++;
				break; 
				
				
			}
			
		}
		
	}

}
