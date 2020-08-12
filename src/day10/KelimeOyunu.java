package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KelimeOyunu {

	public static void main(String[] args) {

		/*
		 * 
		 */
		
		List <String> kelimeler = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		boolean devammi = true;
		int siraKimde = 0;
		int oyunSayisi = 0;
		
		while(devammi) {
			siraKimde = oyunSayisi % 2 + 1;
			System.out.println(siraKimde + "Kullanici kelime yaziniz");
			String kelime = input.next();
			kelimeler.add(kelime);
			oyunSayisi++;
			
			
		}
		
		
		
		
	
		
		
		
			
		
	}

}
