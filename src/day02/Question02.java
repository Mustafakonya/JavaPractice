package day02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

		// kullanıcıdan 2 tam sayı alalım ve dört işlem sonucunu yazdıralım.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki tamsayi giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		double toplam = sayi1 +sayi2;
		System.out.println("Toplama sonucu : " + toplam);
		
		double cikarma = sayi1 - sayi2;
		System.out.println("Cikarma sonucu : " + cikarma);
		
		double carpma = sayi1 *sayi2;
		System.out.println("Carpma sonucu : " + carpma);
		
		double bolme = sayi1 / sayi2;
		System.out.println("Bolme sonucu : " + bolme);
		scan.close();
	}

}
