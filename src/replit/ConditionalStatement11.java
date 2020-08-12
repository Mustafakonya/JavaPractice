package replit;

import java.util.Scanner;

public class ConditionalStatement11 {

	public static void main(String[] args) {

		//Kullanıcıdan bir harf girmesini isteyiniz.
		//Girilen harf sesli ise Sesli harf olduğunu,
		//değilse sessiz harf olduğunu ekrana yazdırsın.
		//Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
		//(Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        //Sesli harfler: a,e,i,o,u
		//Test Data: 
		//a
		//Beklenen Çıktı:
		//a harfi sesli harfdir.
		//Test Data:
		//d
		//Beklenen Çıktı:
		//d harfi sesiz harftir.
		//Test Data: 
		//we  yada %
		//Beklenen Çıktı: 
		//Yanlis karakter girdiniz!
		
		Scanner in = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		String str = in.nextLine();
		String ilk = str.substring(0, 1);
		char ch = str.charAt(0);
		
		if(str.equals(ilk) && ch <= 'Z' && ch >= 'A' || ch <= 'z' && ch >= 'a' ) {
			switch(str) {
			case "a" :
			case "e" :
			case "i" :
			case "o" :
			case "u" :
			case "A" :
			case "E" :
			case "I" :
			case "O" :
			case "U" :
				System.out.println(str + " harfi sesli harfdir.");
				break;
				default:
					System.out.println(str + " harfi sesiz harftir." );
		}
		 
		}else 
			System.out.println("Yanlis karakter girdiniz!");
		
	
				
				
				
				in.close();
}
}