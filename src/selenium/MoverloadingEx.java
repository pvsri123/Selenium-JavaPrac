package selenium;

public class MoverloadingEx {

	
	public static void main(String[] args) {
		MoverloadingEx ml= new MoverloadingEx();
		ml.demoOne(5, 6);
		ml.demoOne("InsightQ", "Technologies");


	}
	
	public void demoOne(int a, int b){
		int c= a*b;
	     System.out.println("multiplication of given values is: "+c);
		}

		public void demoOne(String x, String y){
			String z= x+y;
			System.out.println(z);
		}

}
