package replit;

import java.util.Scanner;

public class ConditionalStatement1 {

	public static void main(String[] args) {

		/*Girilen sayının pozitif,  negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.

         Test data :21
         Beklenen Çıktı:
         Sayi Pozitif

         Test data :-15
         Beklenen Çıktı:
         Sayi Negatif

         Test data :0
         Beklenen Çıktı:
         Sayi Notr */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input number: ");
		int input = in.nextInt();
		
		if(input > 0) {
			System.out.println("Sayi Pozitif");
		}else if(input == 0) {
			System.out.println("Sayi Notr");
		}else {
			System.out.println("Sayi Negatif");
		}
		
		
		
		
		
		
		
		in.close();
		
		
	}

}
