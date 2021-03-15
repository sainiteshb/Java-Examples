package first;

public class arrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6, 5, 5, 5 };
		int c[] = { 5, 7, 8 };

		int d[][] = { { 1, 2, 3, 4 }, { 5, 6, 5, 5, 5 }, { 5, 7, 8 }, };
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print("" + d[i][j]);
			}
			System.out.println();
		}
		for (int k[] : d) {
			for (int l : k) {
				System.out.print("" + l);
			}
			System.out.println();
		}
	}
}
