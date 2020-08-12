package day06;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = input.nextInt();
		int sum = 0;
		do {
			System.out.println("Tekrar sayi giriniz");
				sum += sayi;
				System.out.println("Girilen sayilarin toplami: " + sum);
			   sayi = input.nextInt();
		
		}while(sayi != 0);

		System.out.println("Genel Toplam: " + sum);
		input.close();
	}
}
