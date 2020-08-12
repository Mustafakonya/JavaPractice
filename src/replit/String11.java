package replit;

import java.util.Scanner;

public class String11 {

//	Girilecek iki String nesnesinin aynı verileri içerip içermediğini kontrol etmek için bir Java programı yazın.
//
//	Test Data:
//	Java is fun
//	Java is fun 
//
//	Beklenen Çıktı:
//	True
//
//
//
//	Test Data
//	Java is good
//	Java is fun
//
//	Beklenen Çıktı:
//	False
	
	public static void main(String[] args) {

	    Scanner scan =new Scanner(System.in);
	    String str = scan.nextLine();
	    String str2 = scan.nextLine();
	    
	    if(str.equals(str2)) {
	    	System.out.println("True");
	    }else {
	    	System.out.println("False");
	    }
	    
	    
		scan.close();
	}

}
