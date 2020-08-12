package sunummethodcreation;

import java.util.Scanner;

public class Mc06 {

	public static void main(String[] args) {
		// Kredi karti numarasinin son dort hanesini gosteren bir method yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kredi karti numarasini giriniz");
		String str = scan.next();
		System.out.println(sonDort(str));
		scan.close();

	}

	public static String sonDort(String s) {
		
		String a = s.substring(12);
	
		return a;
	}
}
