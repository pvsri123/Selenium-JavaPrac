package selenium;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		// Integer, double, Boolean
		// data conversion String into Integer
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		// String to Double
		
		String y = "12.3";
		
		Double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		// String to Boolean
		
		/*String k = "true";
		
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		 */
		
		// Int to String conversion
		
		int j = 200;
		System.out.println(j+20);
		
		
		String s = String.valueOf(j);
		System.out.println(s+20);
	}
		
}
