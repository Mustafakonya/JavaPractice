package replit;

import java.util.Scanner;

public class ConditionalStatement3 {

	//Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.

	//Test Data:
	//12
	//34
	//23

	//Beklenen Çıktı:
	//En Buyuk Sayi: 34
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Uc tane sayi giriniz");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("En Buyuk Sayi: " + num1);
		}if(num2 > num1 && num2 > num3) {
			System.out.println("En Buyuk Sayi: " + num2);
		}if(num3 > num1 && num3 > num2) {
			System.out.println("En Buyuk Sayi: " + num3);
		}
		
		in.close();
		
	}

}
