package replit;

import java.util.Scanner;

public class String6 {

//	Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye 
//	doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir. 
//
//	Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
//
//	Test Data:
//	madam
//
//	Beklenen Çıktı:
//	True

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    word = word.toLowerCase().replace(" ", "");
	    
	    String bos = "";
	    for(int i = word.length() - 1; i >= 0; i--) {
	    	 bos = bos + word.charAt(i);
	    }
	    
	    if(bos.equals(word)) {
	    	System.out.println("True");
	    }else {
	    	System.out.println("False");
	    }
	    scan.close();
	}

}
