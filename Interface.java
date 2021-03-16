// Interface Example

package first;

interface Demo {
	int num = 4;
	void abc();
	static void show() {
		System.out.println("IN show");
	}
}
class DemoImp implements Demo{
	
	public void abc() {
		System.out.println("In abc");
	}
}

public class Interface {
	public static void main(String[] args) {
		Demo obj = new DemoImp();
		Demo.show();
		obj.abc();
	}
}
