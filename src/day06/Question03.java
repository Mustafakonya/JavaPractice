package day06;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Saat ve dakika giriniz");
		int saat = input.nextInt();
		int dakika = input.nextInt();
		System.out.println(saniyeDonusturucu(saat,dakika));
		input.close();
	}

	public static int saniyeDonusturucu(int saat, int dakika) {
		int saniye = (saat*3600)+(dakika*60);
		return saniye;
		
		}
}
