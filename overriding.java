// Overriding Class Example

package first;

class A {
	public void show() {
		System.out.println("In A");
	}
}

class B extends A {
	public void show() {
		System.out.println("In B");
	}
}

class C extends A {
	public void show() {
		System.out.println("IN C");
	}
}

public class overriding {
	public static void main(String[] args) {
		A obj = new A();
		obj.show();

		obj = new C();
		obj.show();

	}
}
