package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration
		ArrayList mylist = new ArrayList();
		
		// adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		// print size of array
		System.out.println("size of an array list " +  mylist.size());
		
		//printing array list
		System.out.println("Printing array list" + mylist);
		
		//remove element from array list
		System.out.println("remove element from array list " + mylist.remove(5));
		
		System.out.println("Printing array list" + mylist);
		
		// insert element in the array list
		mylist.add(2, "Java");
		System.out.println(mylist);
		
		//modify the element in the array list (modify/replace/change)
		mylist.set(2, "Python");
		System.out.println(mylist);
		
		//access specific element in array list
		System.out.println(mylist.get(5));
		
		//reading all the element from the list
		
		// using normal for loop
		
	/*	for(int i=0; i<mylist.size(); i++) {
			
			System.out.println(mylist.get(i));
		}*/
		
		//using for each loop
	/*	for(Object x : mylist) {    // what type of data in x -- X consist of hetrogeneous data so it object type because it contains character,boolean,double type of data 
			
			System.out.println(x);
		} */

		// Using iterator
		Iterator it = mylist.iterator();
		
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		
		//remove all the elements from element which we don't need
		// so we have to create another Array list class 
		// remove all method is not allow to remove multiple elements from list  -- also we have one method call clear
		
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("after removing multiple elements :" + mylist);
		
	}

}
