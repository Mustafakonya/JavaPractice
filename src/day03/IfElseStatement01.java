package day03;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {

		//Kullaniciya 4 islemden birini sectirelim.
		//Iki sayi girsin 
		//Sonucu yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 islemden birini seciniz");
		String s = scan.next();
		System.out.println("iki sayi giriniz");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if(s.equalsIgnoreCase("Toplama")) {
			System.out.println("Islem sonucu = " + (n1 + n2));
		}else if(s.equalsIgnoreCase("cikarma")){
			System.out.println("Islem sonucu = " + (n1 - n2));
		}else if(s.equalsIgnoreCase("carpma")) {
			System.out.println("Islem sonucu = " + n1 * n2);
		}else if(s.equalsIgnoreCase("bolme")) {
			System.out.println("Islem sonucu = " + n1 / n2);
		}else {
			System.out.println("Hatali secim");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
