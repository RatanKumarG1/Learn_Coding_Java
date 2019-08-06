package bo;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 * Longest Subsequence length ending with the integer present in  array
 * @author ratan
 *
 */
public class SubSequenceLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		int [] test = {2,1,3,1,6};
		test = getLength(test);
		Arrays.stream(test).forEach(System.out::println);
		System.out.println("Time took - " + (System.currentTimeMillis() - time));
	}
	
	public static int [] getLength(int [] arr) {
		int [] retArr = new int [arr.length];
		for(int i = 0; i < arr.length; i++) {
			int max = 0;
			int count = 0;
			int temp = arr[i];
			for(int j = i; j >= 0; j--) {				
				System.out.println("arr[i] >= arr[j] && arr[j] <= temp");
				System.out.println(arr[i] + " >= "  + arr[j] + " && " + arr[j] + "<="  + temp);
				System.out.println("-----------------");
				if(arr[i] >= arr[j] && arr[j] <= temp) {
					temp = arr[j];					
					count++;
				}
			}
			if(max < count) {
				max = count;
			}
			retArr[i] = max;
		}
		return retArr;
	}
	
	public static int [] getLengthJavaEight(int [] arr) {
		
/*		Arrays.stream(arr).anyMatch(i -> {
			
			IntStream.rangeClosed(0, i).map(j -> (- j + i - 1)).allMatch(k -> {i>=j && });
		});*/
		int [] retArr = new int [arr.length];
		for(int i = 0; i < arr.length; i++) {
			int max = 0;
			int count = 0;
			int temp = arr[i];
			for(int j = i; j >= 0; j--) {				
				System.out.println("arr[i] >= arr[j] && arr[j] <= temp");
				System.out.println(arr[i] + " >= "  + arr[j] + " && " + arr[j] + "<="  + temp);
				System.out.println("-----------------");
				if(arr[i] >= arr[j] && arr[j] <= temp) {
					temp = arr[j];					
					count++;
				}
			}
			if(max < count) {
				max = count;
			}
			retArr[i] = max;
		}
		return retArr;
	}

}
