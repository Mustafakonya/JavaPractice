package replit;

import java.util.Scanner;

public class Giris7 {

	public static void main(String[] args) {

		/*
		 * Girilen 5 tam sayının orlatamasını hesaplayan Java kodunu yazınız.

           Test Sayılar
           10,20,30,40,50

           Bekleen Çıktı

           5 sayinin ortalamasi = 30
		 */
		
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int num5 = in.nextInt();
		int ort = (num1 +  num2 + num3 + num4 + num5) / 5;
		System.out.println("5 sayinin ortalamasi = " + ort);
		
		
		
		
		
		
		
		in.close();
	}

}
