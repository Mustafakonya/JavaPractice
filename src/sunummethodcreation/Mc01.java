package sunummethodcreation;

import java.util.Scanner;

public class Mc01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Uc sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		System.out.println(enKucuk(num1, num2, num3));
		
		scan.close();
		
	}

	public static int  enKucuk(int num1, int num2, int num3) {
		if(num1 == num2 && num2 == num3) {
			return num1;
		}if(num1 < num2 && num1 < num3) {
			return num1;
		}else if(num2 < num1 && num2 < num3) {
			return num2;
		}else {
			return num3;
		}
		
		
		
		
		
	}
	
	
	
}
