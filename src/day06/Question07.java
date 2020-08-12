package day06;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir cumle yaziniz");
		String str = input.nextLine();
		System.out.println("bir harf seciniz");
		char harf=input.next().charAt(0);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == harf) {
				count++;
			}
			
			
			
			
			
		}
		System.out.println(count + " tane " + harf + " harfi var." );
		
		
		
		input.close();	
		
	}

}
