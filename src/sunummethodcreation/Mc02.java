package sunummethodcreation;

import java.util.Scanner;

public class Mc02 {

	//Girilen Stringdeki tum sesli harfleri saymak icin bir java methodu yaziniz.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir String giriniz");
		String s = sc.nextLine();
		
		System.out.println(sesliHarf(s));
		
		sc.close();
	}

	public static int sesliHarf(String s) {
		String a = "a,e,i,o,u";
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = 0; j < a.length() - 1; j++) {
				if(s.charAt(i) == a.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}
	
	
	
}
