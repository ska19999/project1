package javaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c[] = {'k','f','r','d','s'};
		
		System.out.println("before sorting : " + Arrays.toString(c));
		
		Arrays.sort(c);
		
		System.out.println("after sorting : " + Arrays.toString(c));
	}

}
