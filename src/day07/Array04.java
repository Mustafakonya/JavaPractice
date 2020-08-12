package day07;

public class Array04 {

	public static void main(String[] args) {

		//Bir int array icerisindeki tekrarlanan elemani bulan kodu yazalim.
		
		int arr[] = {1, 2, 3, 4, 4, 2, 5, 6, 6};
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Tekrarlanan eleman : " + arr[j]);
					flag++;
				}
			}
		}
		System.out.println(flag);
		if(flag == 0) {
			System.out.println("Tekrarlanan eleman yok");
		}
		
		
		
		
		
	}

}
