package first;

public class StringFUN {

	
	public static void main(String args[]) {
		
		
		String name = "Nitesh";
		
		int result = name.length();
		boolean result1 = name.equals("Nitesh");
		char result2 = name.charAt(3);
		String result3 = name.toLowerCase();
		String result4 = name.toUpperCase();
		Boolean result5 = name.isEmpty();
		int result6 = name.indexOf("t");
		String result7 = name.replace("s", "o");
		
	    System.out.println(result6);
	}
}
