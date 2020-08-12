package day06;


public class Question5 {

	public static void main(String[] args) {
		
		System.out.println(sonuc(145685252));
		
		
	}

	public static int sonuc(int sayi) {
		int toplam = 0;
		int birlerbasamagi = 0;
		while(sayi > 0) {
			birlerbasamagi = sayi % 10;
			toplam += birlerbasamagi;
			sayi = sayi / 10;
		}
		return toplam;
	}
}
