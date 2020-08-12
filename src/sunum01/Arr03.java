package sunum01;

import java.util.Arrays;

public class Arr03 {

	public static void main(String[] args) {

		//Array i tersten yazdiralim
		int arr[] = {2, 11, 0, 23, 7};
		Arrays.sort(arr);// {0,2,7,11,23}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
	}

}
