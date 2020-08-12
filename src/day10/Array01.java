package day10;

import java.util.ArrayList;
import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {

		//Array dizisini arrayList e ceviren java kodu yaziniz.
		//{"Python", "JAVA", "PHP",  "Perl", "C#", "C++"}
		
		String[] my_array = new String[]{"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
		ArrayList <String> list = new ArrayList<String>(Arrays.asList(my_array));
		
		System.out.println(list);
	}

}
