package javaPractice;

import java.util.Iterator;

public class SingleArrays {

	// arrays is collection of elements of same data type(homogeneous data)
	// we can store multiple values in the single variable
	
	// two types of array
	//1- Single dimensional
	//2- Two dimensional
	
	//  Single dimensional Array
	 /*-Declare an array
	    add value into array
	    find length of an array
	    read single value from an array
	    read multiple value from an array*/
	
	//1st approach
	public static void main(String[] args) {
		
		//1st approach 
	/*	int a[] = new int[5];
		
	    a[0]=20;
	    a[1]=40;
	    a[2]=60;
	    a[3]=80;
	    a[4]=100;*/
	    
	    //2nd approach
		int a[]= {20,40,60,80,100};
	
		//find length of an array
		System.out.println("length of array is : " + a.length);
		
		//read single value from an array
		System.out.println(a[4]);  // here 4 is index
		
		//read multiple value from an array
		// normal for loop
	//	for (int i=0; i<5;i++) {   // all combinations  i<=4  i<5  i<=a.length-1   i<a.length
	//
	//	System.out.println(a[i]);
	//	}
		
		//or by using for each loop
		for(int b:a)
		{
			System.out.println(b);
		}
		
	    
	}
}	


