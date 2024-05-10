package javaPractice;

import java.util.Iterator;

public class DoubleArray {

	// Two dimensional/ multi demensional array
	 /*-Declare an array
    add value into array
    find length of an array
    read single value from an array
    read multiple value from an array*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring array
		
		//first approach
		
	/*	int [][]a = new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		 
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
	} */
		
		int a[][]= {{100,200},{300,400},{500,600}};
		// find length of an array
		System.out.println("length of the array : " + a.length);
		
        // find column of array
		System.out.println("length of column : " + a[0].length);
		
		// read single value from an array
		System.out.println(a[2][1]);
		
		// read all the rows and all the columns from array
		 
		//using forloop
		
		for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.println(a[r][c]);
			}
			System.out.println();
		}

	}
	}
