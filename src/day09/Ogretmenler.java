package day09;

import java.util.ArrayList;
import java.util.List;

public class Ogretmenler {

	List <Ogretmen> ogretmenlistesi = new ArrayList<>();

	public Ogretmenler() {

	
	}
	public void ogretmenEkle(Ogretmen ogretmen) {
		ogretmenlistesi.add(ogretmen);
		
	}
	@Override
	public String toString() {
		return "Ogretmenler ogretmenlistesi=" + ogretmenlistesi;
	}
	

}
