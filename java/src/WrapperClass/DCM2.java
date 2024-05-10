package WrapperClass;

public class DCM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  2) Primitive to String
		// int,double,boolean,char -------> String  (string id not a wrapper class)
		
		//any data type to String
		//String.valueOf(); ---- convert all primitive data type to string format
		
		int a = 10;
		double d = 10.5;
		char c = 'A';
		boolean bool = true;
		
		String s = String.valueOf(a);
		System.out.println(s);
		
		 s = String.valueOf(d);
		System.out.println(s);
		
		 s = String.valueOf(c);
		System.out.println(s);
		
		 s = String.valueOf(bool);
		System.out.println(s);
		
		
	}

}
