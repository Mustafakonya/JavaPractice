package replit;

import java.util.Scanner;

public class String8 {

//	String cümleyi verilen örnek cümle ile karşılaştıran Java kodu yazınız.
//
//
//	Test data:
//	String cümle:techproed.com
//	karşılaştırılacak cümle:Techproed.com
//
//	Beklenen Çıktı: 
//	False
//
//	Test data:
//	String cümle:techproed.com
//	karşılaştırılacak cümle:techproed.com
//
//	Beklenen Çıktı: 
//	true
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String c1 = input.nextLine();
		String c2 = input.nextLine();
		
		if(c1.equals(c2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
