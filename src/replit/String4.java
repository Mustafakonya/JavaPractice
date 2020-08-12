package replit;

import java.util.Scanner;

public class String4 {

//	Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.
//
//	Test Data:
//	good
//
//	Beklenen Çıktı:
//	goo
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String giriniz");
		String str = scan.next();
		System.out.println(str.substring(0, str.length() - 1));
		scan.close();
	}

}
