package replit;

import java.util.Scanner;

public class String3 {

//	Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
//
//	Test Data:
//	Java is easy
//
//	Aranan String: is
//
//	Bektenen Çıktı:
//	True
//
//	Aranan String: and
//
//	Beklenen Çıktı:False
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("String kumesi yaziniz");
		String str1 = input.nextLine();
		System.out.println("Aranan Stringi yaziniz");
		String str2 = input.nextLine();
		
		if(str1.contains(str2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		input.close();
		
	}

}
