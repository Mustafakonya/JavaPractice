package day04;

import java.util.Scanner;

public class StringMethods01 {

	public static void main(String[] args) {

		
		String str = "Istanbullu";
		System.out.println(str.indexOf('u'));
		
		
		System.out.println(str.lastIndexOf('l'));
		
		
		System.out.println(str.length());
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Isminizi giriniz");
		String str2 = scan.nextLine();
		
		
		char ilkHarf = str2.charAt(0);
		char sonHarf = str2.charAt((str2.length() - 1));
		System.out.println(sonHarf);
		
		System.out.println(sonHarf + str2.substring(1, str2.length()-1) + ilkHarf);
		
		
		
		System.out.println(str.contains("tan"));
		
		
		
		String str1 = "";
		System.out.println(str1.isEmpty());
		
		
		String ank = "   ankara    ";
		System.out.println(ank);
		System.out.println(ank.trim());
		
		
		System.out.println(str.startsWith("A"));
		
		
		
		System.out.println(str.endsWith("u"));
		
		
		System.out.println(str.substring(4));
		System.out.println(str.substring(2, 8));
		
		
		
		System.out.println(str.concat(str2));
		
		
		
		System.out.println(str2.replace('l', 'ç'));
		
		System.out.println(str.replaceFirst("u", "Y"));
		
		
		
		

		String para1 = "1900";
		String para2 = "2500";
		System.out.println(para1 + para2);
		System.out.println(Integer.valueOf(para1) + Integer.valueOf(para2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
