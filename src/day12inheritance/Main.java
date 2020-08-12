package day12inheritance;

public class Main {

	public static void main(String[] args) {

		
		Hayvan hayvan = new Hayvan("Tekir", 50, 30, "Van kedisi");
		System.out.println(hayvan.getIsim());
		System.out.println(hayvan.getAgirlik());
		System.out.println(hayvan.getUzunluk());
		System.out.println(hayvan.getCins());
		
		hayvan.beslenme();
		hayvan.solunum();
		hayvan.kos();
		
		Bitki bitki = new Bitki("Gul", 2, 1, "Kirmizi");
		bitki.beslenme();
		bitki.solunum();
		
		System.out.println(bitki.getIsim());
		System.out.println(bitki.getAgirlik());
		System.out.println(bitki.getUzunluk());
		System.out.println(bitki.getRenk());
		
		
	}

}
