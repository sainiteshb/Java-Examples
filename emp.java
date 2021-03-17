package first;

class details {
	int eid;
	int sal;
	static String ceo;

	public details() {
		eid = 1;
		sal = 3000;
	}

	public void show() {
		System.out.println(eid + ":" + sal + ":" + ceo);
	}
}

public class emp {
	public static void main(String args[]) {
		details nitesh = new details();
		nitesh.eid = 7;
		nitesh.sal = 1000;
		nitesh.ceo = "Nitesh";

		details elon = new details();
		elon.eid = 18;
		elon.sal = 1000;
		elon.ceo = "Nitesh";

		nitesh.show();
		elon.show();
	}
}
