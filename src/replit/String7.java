package replit;

import java.util.Arrays;

public class String7 {

	public static void main(String[] args) {
		System.out.println(isAnagram("Medine", "Medeni"));
//	Anagram, bir kelimenin harflerinden başka bir kelime oluşturmaya denir.
//
//	Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
//
//	Test Data: 
//	isAnagram("listen", "Silent") ==> true
//
//	isAnagram("earth", "heart") ==> true
//
//	isAnagram("star", "rats") ==> true
//
//	isAnagram("hi", "bye") ==> false
//
//	isAnagram("java", "cava") ==> false
	
}
		public static boolean isAnagram(String str1, String str2) {
			
		boolean isAnagram = false;
		char [] arr1 = str1.replace(" ", "").toLowerCase().toCharArray();
		char [] arr2 = str1.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(arr1);	   
		Arrays.sort(arr2);	   
			    
		if(str1.length() != str2.length()) {
			return isAnagram = false;
		}
		for(int i = 0; i < arr2.length; i++) {
			if(arr1[i] != arr2[i]) {
				return isAnagram = false;
			}
		}
		return isAnagram = true;
			  }
		
	

}
