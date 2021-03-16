package first;

class Calc {
	int num1, num2;
	int result;

	public Calc(int no1, int no2) {
		num1 = no1;
		num2 = no2;

	}

}

public class ObjectDemo {

	public static void main(String[] args) {

		Calc obj = new Calc(8, 5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}
