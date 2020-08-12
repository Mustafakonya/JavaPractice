package day07;


public class Array01 {

	public static void main(String[] args) {

		//3 elemanli String array olusturalim.
		//clever, meek, nice
		//tek tek ve liste halinde yazdiralim
		//herbir array elemanina "ly" ekleyelim
		
		
		String str[] = {"clever", "meek", "nice"};
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		String ek = "ly";
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i].concat(ek) + " ");
		}
		
		
		
		
		
		
		
	}

}
