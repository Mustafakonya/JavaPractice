package day02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
		
		String result1 = sayi < 0 ? "Negatif" : sayi > 0 ? "Pozitif" : "Notr";
		System.out.println(result1);
		
		
		scan.close();
		
	}

}
