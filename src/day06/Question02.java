package day06;


public class Question02 {

	//Girilen sayının tersini return eden java methodunu yazınız.
	public static void main(String[] args) {

		System.out.println(sayininTersi(234567));
		
		
		
		
		
		
	}
	public static int sayininTersi(int n) {
		int sonuc = 0;
		
		while(n > 0) {
			int temp = n%10;
			n /=10;
			sonuc = sonuc * 10 + temp;
			
			
		}
		return sonuc;
	
	}

}
