package sunummethodcreation;

import java.util.Scanner;

public class Mc03EsitlikSorusu {

	public static void main(String[] args) {
		// Iki integer sayinin esitligini kontrol eden method 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers please");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		esit(num1,num2);

		input.close();
	}

	public static void esit(int num1, int num2) {
		
		  if(num1 == num2) { System.out.println("Iki sayi birbirine esittir.");}
		  else {System.out.println("Esitlik yok");}
	}
}
