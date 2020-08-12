package day06;

public class Question04 {

	public static void main(String[] args) {

	enBuyuk(3,6,2);	
		
		
		
	}
	
	public static void enBuyuk(double a, double b, double c) {
		if(a > b && a > c) {
			System.out.println(a);
		}else if(b > a && b > c) {
			System.out.println(b);
		}else if(c > a && c > b) {
			System.out.println(c);
		}
	}

}
