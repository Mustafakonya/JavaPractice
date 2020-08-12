package day06;

import java.util.Scanner;


public class Question01 {

	public static void main(String[] args) {

		//Kullanıcıdan bir String kümesi girmesini isteyelim ve Kaç kelimeden
        //oluştuğunu dönen java methodu yazınız.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime grubu giriniz");
		String kelimeler = input.nextLine();
		
		System.out.println("Metindeki kelime sayisi: " + say(kelimeler));
	
	}

	public static int say(String kelimeler) {
		int count = 0;
		for(int i = 0; i < kelimeler.length(); i++) {
			if(kelimeler.charAt(i) == ' ') {
				count++;
			}
		}
		count += count;
		return count;
		
	}
	
	
}
