package sunum02;

public class Otomobil extends Kara{

	int o = 15;
	
	public static void main(String[] args) {

		Otomobil oto = new Otomobil();
		oto.motor();
		oto.yakit();
		System.out.println(oto.i);
	}

	@Override
	public void motor() {
		System.out.println("3000 motor");
	}

	@Override
	public void yakit() {
		System.out.println("dizel");

}
}
