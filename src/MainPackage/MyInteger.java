package MainPackage;

public class MyInteger {
	int value;
	

	public MyInteger() {
		int value = 1;
	}
	
	public int getValue() {
		
		return value;
	}
	public  boolean isEven() {
		
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
			return false;
		}
	}
	public static boolean isOdd(int num) {
		if (num %2 != 0)
			return true;
		else {
			return false;
				}	
	}
	public boolean isPrime() {
		int i;
		for (i =2; i < value; i++) {
			int n = value % i;
		if (n == 0) {
			return true;
		}
		}
		return false;
	}
	public static boolean isPrime(int num) {
		int i;
		for (i = 2; i < num; i++) {
			int n = num % i;
		if (n == 0) {
			return true;
		}
		}
		return false;
	}	
	//public static boolean isEven(MyInteger) {
		//x = true
				
	//}
	}
//}