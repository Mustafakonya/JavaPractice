package replit;

import java.util.Scanner;

public class Giris2 {

	public static void main(String[] args) {

		/*İki tamsayının toplamasını yapabilen Java Kodunu yazınız.

		Test:
		15 + 10

		Örnek Çıktı:
		25
		*/
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int top = num1 + num2;
		System.out.println("Toplam = " + top);
		
		input.close();
	}

}
