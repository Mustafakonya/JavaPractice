package sunummethodcreation;

import java.util.Scanner;

public class Mc05 {

	public static void main(String[] args) {
		// Iki basamakli sayinin tersinin kendisinden buyukluk durumunu kontrol eden methodu yaziniz.
		//Sayinin kendisi tersinden bubuyk ise True kusuk ise false return etmeli.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		scan.close();
		
		System.out.println(karsilastirma(sayi));
		
	}
	
	public static boolean karsilastirma(int sayi) {
		if(sayi / 10 > sayi % 10) {
		return true;  
		}else {
		return false;
		}
	}

}
