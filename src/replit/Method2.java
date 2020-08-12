package replit;

import java.util.Scanner;

public class Method2 {

//	    Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.
//	    Test Data:
//		java is fun
//		Beklenen Çıktı:
//		Stringdeki sesli harf sayısı: 4
	
	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	    String str = sc.nextLine();
	    int count = 0;
	    for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
					            || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			}
		}
	    System.out.println("Stringdeki sesli harf sayisi: " + count);

	}

}
