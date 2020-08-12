package codingBat;

public class Warmup1MissingChar {

	public static void main(String[] args) {

		System.out.println(missingChar("kitten", 1));
		System.out.println(frontBack("a"));
		
	}

	public static String missingChar(String str, int n) {
		  return str.substring(0, n) + str.substring(n +1 , str.length());
		}
	
	
	public static String frontBack(String str) {
		if(str.length() <= 1) {
			return str;
		}else {
		return str.substring(str.length() - 1) + str.substring(1, str.length() - 1 ) + str.substring(0, 1); 
		}
	}
	
	

	
	
}
