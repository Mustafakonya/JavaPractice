package day08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {

	public static void main(String[] args) {

		//String array icerisindeki 4 harfli kelimeleri return eden bir method yazalim.
		String str[] = {"sali", "cuma", "pazar", "persembe","pers"};
		
		System.out.println(Arrays.toString(dortlu(str)));
		
	}

	public static String[] dortlu(String[] str) {

		ArrayList<String> list = new ArrayList();
		
		for(String w : str) {
			if(w.length()==4) {
				list.add(w);
			}
		}
		String[] result = list.toArray(new String[(list.size())]); 
		
		
		return result;
	}
}
