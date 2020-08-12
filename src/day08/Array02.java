package day08;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {

		//Girilen ifadeyi array kullanarak tersini yazdiralim.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String str = scan.next();
		char arr[] = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
