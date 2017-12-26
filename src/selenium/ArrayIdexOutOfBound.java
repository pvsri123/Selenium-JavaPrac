package selenium;

public class ArrayIdexOutOfBound {

	public static void main(String[] args) 
	{
		int [ ] a  = new int[5];
		a[125] =200;
		System.out.println(a[125]);  // Array IndexOut of Bounds
	}

}
