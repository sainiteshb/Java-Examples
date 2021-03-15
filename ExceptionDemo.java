package first;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int i = 9;
			int j = 0;
			int r = i / j;
			System.out.println("Output is " + r);

		} catch (Exception e) {
			System.out.print("error");
		} finally {
			System.out.print("Bye");
		}

	}
}
