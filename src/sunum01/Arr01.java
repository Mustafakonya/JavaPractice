package sunum01;

import java.util.Arrays;

public class Arr01 {

	public static void main(String[] args) {

		int arr[] = {2, 1, 7, 6};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 2));// index numarasini ver
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 9));

		
	}

}
