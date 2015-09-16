package MainPackage;

public class MyInteger {
	int value = 1;
	
	public static void main (String[] args)  {
		System.out.println("My Number is: " );
		System.out.println("this will be if its even or odd(0 is even)");
		System.out.println("this will be if its prime or not");
	}

	public MyInteger() {
		int value = 1;
	}
	public  boolean isEven() {
		//this should have the if/else statements
		if (value %2 == 0)
			return true;
		else {
			return false;
		}
	}
	
	public static boolean isEven(int num) {
		if (num %2 == 0)
			return true;
		else {
			return false;
			}
	}
	public boolean isOdd() {
		if (value %2 != 0)
			return true;
		else {
			
		}
			
		
	}
	public void isPrime() {
		
		}
	
		
}
