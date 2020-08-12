package day11;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {

		/*
         * Bir palindrom, madam veya racecar veya 10801 sayısı gibi
         * ileriye doğru geriye doğru okuyan bir kelime, sayı, 
         * kelime öbeği veya diğer karakter dizisidir.
            Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
         */

		Scanner input = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String str = input.nextLine().toLowerCase().replace(" ", "");
		String bos = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			bos = bos + str.charAt(i);
		}
		if(bos.equals(str)) {
			System.out.println("Polindrom");
		}else {
			System.out.println("Polindrom degil");
		}
		
		
		input.close();
	}
}
