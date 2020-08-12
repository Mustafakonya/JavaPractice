package day03;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {

		// Kullanıcıdan 3 tene pozitif  tam sayı alalım 
		// bu uc sayidan ucgen olup olmama durumunu kontrol edelim
		// eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim
			// a+b>c>a-b 1
			//a+c>b>a-c  1
			//b+c>a>b-c  1
			//a=b=c es kenar ucgen 
			// sadece ucgen
			//ucgen degildir.

		Scanner scan = new Scanner(System.in);
		System.out.println("Uc tane pozitif tamsayi giriniz.");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		if((n1 + n2) > n3 && n3 > (n1 -n2) && (n1 + n3) > n2 && n2 > (n1 - n3) 
				&& (n2 + n3) > n1 && n1 > (n2 - n3) && n1 != n2 && n1 != n3) {
			System.out.println("ücgen");
		}else if(n1 == n2 && n1 == n3) {
			System.out.println("eskenar ucgen");
		}else {
			System.out.println("ucgen degildir");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
