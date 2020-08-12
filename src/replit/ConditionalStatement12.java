package replit;

import java.util.Scanner;

public class ConditionalStatement12 {

	public static void main(String[] args) {

		
		//Ugly Number: 
			 
		//	Girilen bir sayının  ugly number olup olmadığını
		//  kontrol etmek için bir Java programı yazın.


		//	Sayı sisteminde,  ugly number  sadece asal faktörleri
		//  2, 3 veya 5 olan pozitif sayılardır.
		//  İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

		//	Test Data:
		//	13

		//	Beklenen çıktı:
		//	ugly number  degildir

		//	Test Data:
		//	25
		//	Beklenen Çıktı:

		//	ugly number 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = sc.nextInt();
		
		//if(i == 1 || i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
		//	System.out.println("ugly number");
		//}else {
		//	System.out.println("ugly number degildir");
		//}
		
		
		
		sc.close();
		
		
		
		
		for (; sayi%5==0||sayi%3==0||sayi%2==0;) {
			
			
			if (sayi%5==0) {
				sayi=sayi/5;
			}if (sayi%3==0) {
				sayi=sayi/3;
			}if (sayi%2==0) {
				sayi=sayi/2;
			}	
			}if (sayi==1) {
				System.out.println("ugly number ");
			}else {
				System.out.println("ugly number degildir");
			}


	}

}
