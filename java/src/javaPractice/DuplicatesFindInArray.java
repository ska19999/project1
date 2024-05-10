package javaPractice;

public class DuplicatesFindInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {100,200,100,300,100,400,100,200};
		int num=100;
		int count=0;
		
		
		for(int value:a) {
			if (value==num)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
