package replit;

public class ConditionalStatement8 {

	//1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

	 //Beklenen çıltı:
	                                                                                   
	//1                                                                                                       
	//12                                                                                                       
	//123                                                                                                       
	//1234                                                                                                       
	//12345                                                                                                       
	//123456                                                                                                       
	//1234567                                                                                                       
	//12345678                                                                                                      
	//123456789                                                                                                     
	//12345678910
	
	public static void main(String[] args) {

		int c = 2;
		for(int i = 1; i <= c; i++) {
				System.out.println(i + "" + c);
			if(c < 10) {
               c++;
		}
		
		
		
		
	}

}
}