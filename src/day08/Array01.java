package day08;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {

		//Array elemanlari siralayan bir kod yazalim
	    int arr[] = {1,2,3,4,56,67,8,9,9};
		
	    for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
	    	System.out.println(arr[i]);
		}
		
		String str[] = {"java", "C#", "pyhton", "C++"};
		System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
	}

}
