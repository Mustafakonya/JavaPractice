package day03;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("mesleginizi giriniz");
		String str = scan.nextLine();
		
		if(str.equalsIgnoreCase("qa")) {
			System.out.println("Quality Analyst");
		}else if(str.equalsIgnoreCase("dev")) {
			System.out.println("Developer");
		}else if(str.equalsIgnoreCase("ba")) {
			System.out.println("Business Analyst");
		}else if(str.equalsIgnoreCase("pm")) {
			System.out.println("Project Manager");
		}else {
			System.out.println("Hatali giris");
		}
		
		
		
		
		
		
		
		scan.close();
		
		
	}

}
