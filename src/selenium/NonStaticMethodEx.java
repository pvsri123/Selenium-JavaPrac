package selenium;

public class NonStaticMethodEx {

	public   void methodOne() {
		System.out.println("It is a sub-method-1");
	}
	public void methodTwo() {
		System.out.println("It is a sub-method-2");
	}
	public static void main(String[] args) {
		
		//Directly we cannot call the non-static method so we have to create instance object by calling class
		
		NonStaticMethodEx  Obj = new NonStaticMethodEx();
		
		Obj.methodOne();
		Obj.methodTwo();
	}

}
