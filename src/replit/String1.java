package replit;

import java.util.Scanner;

public class String1 {

//	Girilen String değerde tersten yazan Java kodunu yazınız.
//
//	Test Data:
//	java
//	avaj
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    System.out.println("String yaziniz");
		String sentence = scan.nextLine();
	    
	    for(int i = sentence.length() - 1; i >= 0; i--) {
	    	char s = sentence.charAt(i);
	    	System.out.print(s);
	    }
		
		scan.close();
	}

}
