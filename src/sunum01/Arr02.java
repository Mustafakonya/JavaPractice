package sunum01;

import java.util.Arrays;

public class Arr02 {

	public static void main(String[] args) {

		//Incex i cift olan elemanlari yazidiriniz.
		int myArray[] = {10, 11, 12, 13, 14, 15};
		
		int i = 0;
		while(i < myArray.length) {
			if(i % 2 == 0) {
				System.out.print(myArray[i] + " ");}
				i++;
			
		}
		
	}

}
