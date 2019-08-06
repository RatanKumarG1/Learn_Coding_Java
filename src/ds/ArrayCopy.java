package ds;

import java.util.Arrays;
/**
 * Merge Two sorted arrays
 *  
 * @author ratan
 *
 */
public class ArrayCopy {

	public static void main(String[] args) {
		int [] a = {1,3,5,7,9,10,11,12,16};
		int [] b = {0,2,6,8,10};
		int [] c = new int [a.length + b.length];
		
		int i = 0,j = 0,k = 0;
		
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				c[k++] = a[i++];
			}else {
				c[k++] = b[j++];
			}
		}

		Arrays.stream(c).forEach(System.out::println);
		System.out.println("-----");
		/*if(a.length > b.length) {
			System.arraycopy(a, b.length - 1, c, b.length * 2, a.length - b.length );
		} else if (a.length < b.length) {
			System.arraycopy(b, a.length - 1, c, a.length * 2, b.length - a.length);
		}*/
		// Store remaining elements of first array 
        while (i < a.length) 
            c[k++] = a[i++]; 
      
        // Store remaining elements of second array 
        while (j < b.length) 
            c[k++] = b[j++]; 
		
		Arrays.stream(c).forEach(System.out::println);
		
	}
}
