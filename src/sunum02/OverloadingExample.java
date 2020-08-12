package sunum02;

public class OverloadingExample {

	public static void main(String[] args) {

		selam();
	}

	public static void selam() {
		System.out.println("merhaba");
	}
	public static void selam(String str) {
		System.out.println("merhaba 1");
	}
	public static void selam(String str1, String str2) {
		System.out.println("merhaba 2");
	}
	public static void selam(int sayi, String str2) {
		System.out.println("merhaba 3");
	}
	public static void selam(String str2, int sayi) {
		System.out.println("merhaba 4");
	}
	
	
	
	
}
