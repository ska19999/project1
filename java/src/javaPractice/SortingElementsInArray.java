package javaPractice;

import java.util.Arrays;

public class SortingElementsInArray {

	// sort method is not allow to print number in descending order
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= { 100,600,200,400,500};
		
		System.out.println("before sorting");

		System.out.println(Arrays.toString(a)); // this is also use to print array
		
		/*for(int x:a)
		{
			System.out.println(x);
		}	*/
		
		Arrays.sort(a);
		
		System.out.println("After sorting");
		
		System.out.println(Arrays.toString(a));
		}

}
