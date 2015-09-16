package MainPackage;

public class MyInteger {
	//Establish the private variable "value"
	private int value;
	
	//Constructor for MyInteger
	public MyInteger(int value) {
		this.value = value;
	}
	
	//Getter and setter for value
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	//Instance methods isEven(), isOdd(), and isPrime()
	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (this.value % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		//Divide the value by every number less than the value but greater than 1
		//Check for a remainder of 0
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0) {
				//If the remainder is 0, the value is not prime
				return false;
			}
		}
		//If it makes it out of the for loop without returning false, then:
		return true;
	}
	
	//Static methods isEven(int), isOdd(int), and isPrime(int)
	public static boolean isEven(int val) {
		if (val % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int val) {
		if (val % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int val) {
		//Divide the value by every number less than the value but greater than 1
		//Check for a remainder of 0
		for (int i = 2; i < val; i++) {
			if (val % i == 0) {
				//If the remainder is 0, the value is not prime
				return false;
			}
		}
		//If it makes it out of the for loop without returning false, then:
		return true;
	}
	
	//Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger)
	public static boolean isEven(MyInteger myInt) {
		if (myInt.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger myInt) {
		if (myInt.value % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(MyInteger myInt) {
		//Divide the value by every number less than the value but greater than 1
		//Check for a remainder of 0
		for (int i = 2; i < myInt.value; i++) {
			if (myInt.value % i == 0) {
				//If the remainder is 0, the value is not prime
				return false;
			}
		}
		//If it makes it out of the for loop without returning false, then:
		return true;
	}
	
	//Instance method equals(int)
	public boolean equals(int val) {
		if (this.value == val) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Instance method equals(MyInteger)
	public boolean equals(MyInteger myInt) {
		if (this.value == myInt.value) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//static method parseInt(char[]):  array of numeric characters -> int value
	public static int parseInt(char[] chars) {
		String newString = new String(chars);
		int newInt = Integer.parseInt(newString);
		return newInt;
	}
	
	//static method parseInt(String): String -> int
	public static int parseInt(String newString) {
		int newInt = Integer.parseInt(newString);
		return newInt;
	}
}
