package replit;

import java.util.Scanner;

public class String9 {

//	Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.
//	 
//	Test Data:
//	Java is fun
//
//
//	Beklenen Çıktı
//	0. pozisyondaki karakter : J
//
//	5. pozisyondaki karakter : i
	
	public static void main(String[] args) {

	    Scanner sc= new Scanner(System.in);
	    String str = sc.nextLine();
	    int i = sc.nextInt();
	    char ch = str.charAt(i);
	    System.out.println(i + "." + " pozisyondaki karakter : " + ch);
	  
	    
		sc.close();
	}

}
