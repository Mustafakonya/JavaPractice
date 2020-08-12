package day02;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char ch = scan.next().charAt(0);
		
		/*if(ch >= 'a' && ch<= 'z') {
			System.out.println("Kucuk harf");
		}else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("Buyuk harf");
		}else {
			System.out.println("Hatali giris");
		}*/
		
		String result = (ch >= 'a' && ch<= 'z') ? ("Kucuk harf") : ch >= 'A' && ch <= 'Z' ? ("Buyuk harf"): ("Hatali giris");
		System.out.println(result);
		scan.close();
		
		
		
	}

}
