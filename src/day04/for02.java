package day04;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		int i = 1;
		for(; i <= 10 ; i++ ) {
			System.out.println(i + "x" + num + "=" + i * num  );
		}
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
	}

}
