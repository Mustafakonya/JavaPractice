package replit;

import java.util.Scanner;

public class String10 {

//	Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.
//
//	Test Data:
//	java is fun
//
//	Beklenen Çıktı:
//	JAVA IS FUN
	
	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	    String str = sc.nextLine();
	    System.out.println(str.toUpperCase());
		sc.close();
	}

}
