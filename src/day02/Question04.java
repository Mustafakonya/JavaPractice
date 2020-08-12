package day02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz");
		char ilk = scan.next().charAt(0);
		
		System.out.println("Soyisminizi giriniz");
		char ikinci = scan.next().charAt(0);
		
		System.out.println("Adinizin ilk harfi : " + ilk + "\n" + "Soyisminizin ilk harfi : " + ikinci );
		
scan.close();
		
		
		
	}

}
