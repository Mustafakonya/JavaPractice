package replit;

import java.util.Scanner;

public class String5 {

//	Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.
//
//	Test Data:
//	Java is fun
//
//	Beklenen Sonuç:
//	JAVA IS FUN
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str.toUpperCase());
		scan.close();
	}

}
