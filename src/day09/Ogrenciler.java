package day09;

import java.util.ArrayList;
import java.util.List;

public class Ogrenciler {

	List <Ogrenci> ogrenciListesi = new ArrayList<>();
	
	public Ogrenciler() {

	}

	public void ogrenciEkle(Ogrenci ogrenci) {
		ogrenciListesi.add(ogrenci);
		
	}
}
