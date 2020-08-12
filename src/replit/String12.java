package replit;

import java.util.Scanner;

public class String12 {

//	Girilen String değerin uzunluğunu yazdıran Java kodunu yazınız.
//	Test Data
//	techproed.com
//	Beklenen çıktı:
//	techproed.com 13 karakterdir.
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str + " " + str.length() + " karakterdir.");
		
		scan.close();
	}

}
