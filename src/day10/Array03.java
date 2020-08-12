package day10;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {

		// Kullanıcidan 5 adet tam sayi girmesini isteyelim ve bu sayilari bir 
        // arrayde toplayalim,
        // içindeki çift sayilarin sayisini yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bes tane sayi giriniz");
		int nums[] = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Girilen sayilardaki cift sayi adedi " + count );
	}

}
