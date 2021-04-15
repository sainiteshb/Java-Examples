package first;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		
		double x,y,z,s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side x:");
		x= sc.nextDouble();
		
		System.out.println("Enter the side y:");
		y=sc.nextDouble();
		
		s = (x*x) + (y*y);
		
		z = Math.sqrt(s);
		
		System.out.println("Hypotunese is: " + z);
		
		sc.close();
	}
}
