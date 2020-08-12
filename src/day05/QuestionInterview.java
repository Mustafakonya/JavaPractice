package day05;

import java.util.Scanner;

public class QuestionInterview {

	public static void main(String[] args) {

		//Kullanicidan bolunen bolen seklinde iki sayi alalim ve bolme operatoru kullanmadan
		//bolme islemini gerceklestirelim. bolum yazdiralim
		
		Scanner input = new Scanner (System.in);
		System.out.println("Iki sayi giriniz");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double i = 0;
		while(num1 >= num2) {
			num1 = num1 - num2;
			i++;
		}
		System.out.println(i);
		
		input.close();
		
		
	}

}
