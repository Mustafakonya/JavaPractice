package day08;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {

		//Bir int Array icerisinde aradigimiz sayinin olup olmadigini kontrol edelim.
		//[12,32,34,54,45]
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		int arr[] = {12,32,34,54,45};
		//int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				System.out.println("Girdiginiz sayi array de mevcut");
				break;
			}else {
				System.out.println("Girdiginiz sayi array de mevcut degil");
				break;
			}
				
			
		}
		
		
		
		
		
		
	}

}
