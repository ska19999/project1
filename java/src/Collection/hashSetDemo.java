package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSetDemo {

	public static void main(String[] args) {

		//Declaration
	//	HashSet<E> hs = new HashSet<E>();
	//    Set myset = new HashSet();
		
		HashSet myset = new HashSet();
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset); // insertion order is not preserved , dupli9cates not allowed , only one null value accept
		
		//remove specific value from the hash set
		myset.remove(10.5) ;// here we can't give index direct specify value  (here 10.5 is value not index)
		System.out.println("after removing : " + myset);
		
		// inserting element  ---  insertion of element is not possible because if we store the element in proper order then insertion is possible
		//                        but  in hash set insertion order is not preserved
		
		// Access specific element is also not possible
		
	    // convert hash set TO array list
		ArrayList al = new ArrayList(myset);  // here we have to create the array list object
		System.out.println(al);
		
		System.out.println(al.get(2));  // get method is used to access on specific index
		
		// read all the values from hash set
		// for loop is not possible because here we can not do indexing
		
		// by using for each loop
	/*	for(Object x : myset) {
			System.out.println(x);
		}*/
		
		// using iterator
	      Iterator <Object>it=myset.iterator();
	      
	      while(it.hasNext()) {
	    	 System.out.println(it.next());
	      }
	      
	      // clearing all the elements
	      myset.clear();
	      System.out.println(myset);
	
		
	}

}
