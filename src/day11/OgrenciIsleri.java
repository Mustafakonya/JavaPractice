package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciIsleri {

	public static void main(String[] args) {

		ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		
		Scanner input = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Hangi islemi yapmak istersiniz? \n 1-) Ogrenci kaydet \n 2) Ogrenci sil"
					+ "\n 3-) Ogrencileri goruntule \n 4-) Cikis" );
			
			int islem = input.nextInt();
			if(islem == 1) {
				System.out.println("Ogrenci ismini girin: ");
				String isim = input.nextLine();
				System.out.println("Ogrenci soyadini giriniz");
				String soyisim = input.nextLine();
				System.out.println("Ogrenci numarasini giriniz");
				int numara = input.nextInt();
				System.out.println("Ogrenci ortalamasini giriniz");
				double ortalama = input.nextDouble();
				input.nextLine();
				
				Ogrenci ogrenci = new Ogrenci(numara, isim, soyisim, ortalama);
				
				ogrenciler.add(ogrenci);
				
				

			}else if(islem == 2) {
				System.out.println("Hangi ogrenciyi silmek istersiniz");
				String isim = input.nextLine();
				Ogrenci ogrenci = null;
				for (Ogrenci ogr : ogrenciler) {
					if(ogr.getAdi().equals(isim)) {
						ogrenci = ogr;
					}
				}
				
				ogrenciler.remove(ogrenci);
				
				
			}else if(islem == 3) {
				if(ogrenciler.isEmpty()) {
					System.out.println("Su an listede kayitli ogrenci bulunmamaktadir\n-----------");
				}
				for(Ogrenci ogrenci : ogrenciler) {
					System.out.println("Ogrencinin adi: " + ogrenci.getAdi() + "\n Ogrencinin Soyadi: " + ogrenci.getSoyadi() +
							"\nOgrencinin Nmarasi: " + ogrenci.getNumarasi() + "\nOgrencinin Ortalamasi:" + ogrenci.getOrtalama());
					
				}
			}else if(islem == 4) {
				System.out.println("Program sonlandirildi");
				break;
			}
			
			
			
		}
		
		
		input.close();
		
		
	}

}
