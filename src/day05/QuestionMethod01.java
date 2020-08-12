package day05;

import java.util.Scanner;

public class QuestionMethod01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen 1. sayiyi giriniz");
		double num1 = input.nextDouble();
		System.out.println("Lutfen 2. sayiyi giriniz");
		double num2 = input.nextDouble();
		System.out.println("Dort islemden birisini seciniz");
		String islem = input.next().toLowerCase();
		islem(islem,num1,num2);
		input.close();
		
	}
	
	public static void islem(String islem, double num1, double num2 ) {
		switch(islem) {
		case"toplama":
			toplama(num1,num2);
			break;
		case"carpma":
			carpma(num1, num2);
			break;
		case"bolme":
			bolme(num1, num2);
			break;
			default:
				System.out.println("Yanlis islem sectiniz");
		}
	}

	public static void toplama(double num1, double num2){
		System.out.println("Toplama isleminin sonucu : " + (num1 + num2));} 
	
	public static void cikarma(double num1, double num2){
	    System.out.println("Cikarma isleminin sonucu : " + (num1 - num2));}	
		
	public static void carpma(double num1, double num2){
		System.out.println("Carpma isleminin sonucu : " + (num1 * num2));}
				
	public static void bolme(double num1, double num2){
		System.out.println("Bolme isleminin sonucu : " + (num1 / num2));
	}
	
	
	
	
	
}
