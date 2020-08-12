package day10;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {

	    // Kullanıcıdan 30.01.2000 formatında tarih alacağız ve bu tarihi yazıya çeviren java kodu yazalım
        //otuzocakikibin
		//"ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos",
        //"eylul", "ekim", "kasim", "aralik"
		//"bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"
		//"on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"
		//"yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"
		//"bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"
		
		Scanner input = new Scanner(System.in);
		System.out.println("Tarih giriniz");
		String trh = input.nextLine();
		
		int on = new Integer(trh.substring(0, 1));
		int bir = new Integer(trh.substring(1, 2));
		int ay = new Integer(trh.substring(3, 5));
		int yilbinler = new Integer(trh.substring(6, 7));
		int yilyuzler = new Integer(trh.substring(7, 8));
		int yilonlar = new Integer(trh.substring(8, 9));
		int yilbirler = new Integer(trh.substring(9, 10));
		
		String [] aylar = {"","ocak", "subat", "mart", "nisan", "mayis", "haziran",
				"temmuz", "agustos","eylul", "ekim", "kasim", "aralik"};
		String [] birler = {"","bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"};
		String [] onlar = {"","on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"};
		String [] yuzler = {"","yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"};
		String [] binler = {"","bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"};
		
		System.out.println("Girilen tarihin yazi ile yazilmasi: "+onlar[on] + birler[bir]+" "
		        +aylar[ay]+" " + binler[yilbinler]+ yuzler[yilyuzler]+
				onlar[yilonlar] + birler[yilbirler]);

		
		
		
		
		
		
		
		
		
	}

}
