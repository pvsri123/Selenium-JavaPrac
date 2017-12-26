package selenium;

public class CarObjEx01 {

	// class variables
	// global variables
	 int mod;
	 int wheels;
	 
	public static void main(String[] args) {
		
		
		CarObjEx01  a =new CarObjEx01();
		CarObjEx01  b =new CarObjEx01();
		CarObjEx01  c =new CarObjEx01();
		
		a.mod= 2015;
		a.wheels=4;
		b.mod=2010;
		b.wheels=3;
		c.mod=2017;
		c.wheels=4;
		
		System.out.println(a.mod);
		System.out.println(a.wheels);
		System.out.println(b.mod);
		System.out.println(b.wheels);
		System.out.println(c.mod);
		System.out.println(c.wheels);		
		
	}

}
