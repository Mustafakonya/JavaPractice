package replit;

public class Giris5 {

	private static final double radius = 7.5;
	public static void main(String[] args) {

		/*
		Dairenin Çevresini ve Alanını hesaplayan Java kodunu yazınız. (r=7.5)
		Not: Pi sayısı =  Math.PI 

		Beklenen Çıktı: 
		Dairenin Cevresi = 47.12388980384689
		Dairenin Alani = 176.71458676442586   */
		
		double cevre = 2 * Math.PI * radius;
		double alan = Math.PI * radius * radius;
		
		System.out.println("Dairenin Cevresi = " + cevre);
		System.out.println("Dairenin Alani = " + alan);
		

	}

}
