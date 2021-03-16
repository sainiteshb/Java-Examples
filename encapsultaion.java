// Encapsulation Demo 
package first;

class Student{
	private int rollno;
	private String name;
	
	public void setRollno(int r) {
		this.rollno = r;
	}
	public int getRollno() {
		return rollno;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return name;
	}
	
}

public class encapsultaion {
   public static void main(String[] args) {
	   Student s1 =new Student();
	   s1.setRollno(7);
	  System.out.print(s1.getRollno());
	   
   }
   
   
}
