package replit;

import java.util.Scanner;

public class String2 {

//	2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.
//
//	Test Data:
//	str1: Java is
//	str2: fun
//
//	Beklenen Çıktı:
//	java is fun
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    String str1 = input.nextLine();
	    String str2 = input.nextLine();
	     
	    System.out.println(str1 + " " + str2);
	    
	    
	    input.close();
	}

}
