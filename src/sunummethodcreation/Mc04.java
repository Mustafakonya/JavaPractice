package sunummethodcreation;

import java.util.Scanner;

public class Mc04 {

	public static void main(String[] args) {

		//Bir ciftlikte tavuk, inek ve kecilerin ayak sayilari toplamini
		//return eden java kodunu yaziniz.
		Scanner scan = new Scanner(System.in);
		System.out.println("Tavuk sayisini giriniz");
		int tavuk = scan.nextInt();
		System.out.println("Inek sayisini giriniz");
		int inek = scan.nextInt();
		System.out.println("Keci sayisini giriniz");
		int keci = scan.nextInt();
		System.out.println("Toplama ayak sayisi: " + ayakSayisi(tavuk, inek, keci));
		scan.close();
	}

	public static int ayakSayisi(int tavuk, int inek, int keci) {
		int count = 2 * tavuk + 4 * inek + 4 * keci;
		
			return count;
		}
	}

