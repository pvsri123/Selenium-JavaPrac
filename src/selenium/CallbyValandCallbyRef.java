package selenium;

public class CallbyValandCallbyRef {
	int p;
	int q;

	public static void main(String[] args) {
		
		CallbyValandCallbyRef obj = new CallbyValandCallbyRef();
		
		int x=10;
		int y=20;
		int z = obj.testSum(x, y);  // call by value or pass by value
		System.out.println(z);
		
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
				
	}

	public int testSum(int a,int b)
	{
			a=30;
			b=40;
		int c = a+b;
		return c;
		}
	
	// call by reference
	
	public void swap(CallbyValandCallbyRef t){
		
		int temp ;
		temp= t.p;
		t.p=t.q;
		t.q=temp;
		
		
	}
}
