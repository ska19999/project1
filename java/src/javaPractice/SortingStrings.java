package javaPractice;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = {"mahindra","tata","ford","toyota","audi"};
		
		System.out.println("before sorting : " + Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting : " + Arrays.toString(s));
	}

}
