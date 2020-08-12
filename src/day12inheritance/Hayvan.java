package day12inheritance;

public class Hayvan extends Canli{
	
	private String cins;

	public Hayvan(String isim, int uzunluk, int agirlik, String cins) {
		super(isim, uzunluk, agirlik);
		this.cins = cins;
	}
	
	public void kos() {
		System.out.println("Hayvan sinicinda kos methodu calisti");
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	@Override
	public void beslenme() {
		System.out.println("Hayvan sinifinda beslenme metodu calisti");
	}

	@Override
	public void solunum() {
		System.out.println("Hayvan sinifinda solunum metodu calisti");
	}

}
