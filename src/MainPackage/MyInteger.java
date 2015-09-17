package MainPackage;

public class MyInteger {
	private int value;
	

	public int getValue() {		
		return value;
	}
	
	public MyInteger() {
		int value = 1;
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
	
	public static boolean isEven(MyInteger myInt) {
		if (myInt.getValue() %2 == 0)
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
	
	public static boolean isOdd(MyInteger myInt) {
		if (myInt.getValue() %2 != 0)
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
	
	public static boolean isPrime(MyInteger myInt) {
		int i;
		for (i = 2; i < myInt.getValue(); i++) {
			int num = myInt.getValue() % i;
		if (num == 0) {
			return true;
		}
		}
		return false;
	}		

	public boolean equals(int num) {
		if (num == this.getValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean equals(MyInteger myInt) {
		if (value == myInt.getValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int parseInt(char[] a){
	    int num = 0;
	    for(int i : a){
	        num += i;
	    }
	    return num;
	}
	public static int parseInt(String s) {
		int num = Integer.parseInt(s);
				return num;
	}
}