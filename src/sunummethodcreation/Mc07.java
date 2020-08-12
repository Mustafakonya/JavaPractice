package sunummethodcreation;

import java.util.Arrays;
import java.util.Scanner;

public class Mc07 {

	// Methoda iki sayi girelim ve bize bir array donsun.
	//Array elemanlari 1. sayinin 2. sayi kadar kendisi ile toplamindan olussun.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayilari giriniz");
		int num = scan.nextInt();
		System.out.println("Array in uzunlugunu giriniz");
		int length = scan.nextInt();
		System.out.println(Arrays.toString(array(num, length)));

	}

	public static int[] array(int num, int length){
		int product = 1;
		int arr[] = new int[length];
		for (int i = 0; i <= length - 1; i++) {
			product *= num;
			arr[i] = product;
		}
		return arr;
	}
}
