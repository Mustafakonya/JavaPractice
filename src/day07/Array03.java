package day07;

public class Array03 {

	public static void main(String[] args) {

		//Array elemanlarinin ortalamasini bulan java kodu yazalim.
		//20,30,40,25,-15,55
		
		int arr[] = {20, 30, 40, 12, 25, -15, 55};
		double sum = 0;
		double ort = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		ort = sum / arr.length;
		System.out.println("Array in eleman sayilarinin ortalamasi: " + ort);
		
		
		
		
	}

	
	}

