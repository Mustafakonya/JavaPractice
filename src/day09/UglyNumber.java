package day09;

import java.util.Scanner;

public class UglyNumber {

//	Girilen bir sayının  ugly number olup olmadığını kontrol etmek icin bir Java programı yazın.
//	Sayı sisteminde,  ugly number  sadece asal faktorleri 2, 3 veya 5 olan pozitif sayılardır. 
//	İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.


	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen ugly number giriniz");
		
		int n = input.nextInt();
		if(n < 0) {
			System.out.println("Hatali bir sayi girdiniz");
		}
		int flag = 0;
		while(n != 1) {
			if(n % 5 == 0) {
				n /= 5;
			}else if(n % 3 == 0) {
				n /= 3;
			}else if(n % 2 == 0) {
				n /= 2;
			}else {
				System.out.println("Ugly number degildir.");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println(n + "Ugly number");
		}
		input.close();
	}

}
