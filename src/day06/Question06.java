package day06;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime = input.next();
		
		
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.print(kelime.charAt(i) + " ");
			input.close();
		}
	}

}
