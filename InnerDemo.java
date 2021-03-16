// Inner Method Demo
package first;

class Outer {
	int a;

	public void show() {
		System.out.println("In show");
	}

	static class Inner {
		public void display() {
			System.out.println("In display");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();

		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}
}
