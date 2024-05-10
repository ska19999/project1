package WrapperClass;

public class DataConversionMethos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// wrapper class in java is used for data conversion
		
		// for every primitive data type there is a wrapper class
		
	/*	int - Integer
		float - Float
		double - Double
		char - Charactger
		boolean - Boolean
	}*/
		
	/*	String ---int -         Integer.parseInt(String value);
		String ---double -      Integer.parseInt(String value);
		String ---boolean -     Integer.parseInt(String value);
		String ---char -         Integer.parseInt(String value); // it is not possible  */
		
		//1) String to Primitive data type
		
		//String to int
		//int sint = Integer.parseInt(s);  //we can not convert string to integer
		String s1 = "10";
		String s2 = "20";
		//first we have to convert string data into integer and after we do addition
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		//String to double
		String a1 = "10.5";
		String a2 = "20.0";//first we have to convert string data into double and after we do addition
		System.out.println(Double.parseDouble(a1)+Double.parseDouble(a2));
		
		//String to boolean
		String b = "Selenium"; // other than true if you pass any string it will give false
		boolean b1 =Boolean.parseBoolean(b);
		System.out.println(b1);
		

}
}