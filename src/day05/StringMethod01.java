package day05;

import java.util.Scanner;

public class StringMethod01 {

	public static void main(String[] args) {

		//Kullanicidan alacagimiz hotmail adresini gmail olarak degistirelim
		//abc@hotmail.com => abc@gmail.com
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Email adresinizi giriniz");
		String hotmail = input.nextLine();
		
		
	String gmail = hotmail.replace("@hotmail.com", "@gmail.com");
		
		System.out.println(gmail);
		
		System.out.println();
		
		 if(hotmail.contains("@hotmail")) {
	            String gmail2=hotmail.replace("@hotmail.com","@gmail.com");
	            System.out.println(gmail2);
	            
	        }else {
	            System.out.println("Mail adresiniz hotmail icermiyor.");
	        }

	input.close();	
	}

}
