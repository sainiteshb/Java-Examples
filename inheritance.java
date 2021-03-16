// Inheritance Example of extending a existing class 

package first;

class Calculator {
	public int add(int i, int j) {
		return i + j;
	}
	public int mul(int i, int j) {
		return i*j;
	}
}

class CalAdv extends Calculator {
	public int sub(int i, int j) {
		return i - j;
	}
}

public class inheritance {

	public static void main(String[] args) {
		CalAdv c1 = new CalAdv();
		int result1 = c1.add(5, 8);
		int result2 = c1.mul(9, 4);
		System.out.print(result1 +","+ result2);

	}
}
