package day07;

public class AsalCozum {

	public static void main(String[] args) {

		//Asal sayiyi bulan bir method yazalim.
		
		asalSayi(123124);
		
	}

	public static int asalSayi(int num) {
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
		if(num % i == 0) {
			count++;
		}
		}
		if(count == 2) {
			System.out.println("Asal sayidir. " + num);
		}else {
			System.out.println("Asal sayi degildir.");
		}
		return num;
	}
	
	
	
}
