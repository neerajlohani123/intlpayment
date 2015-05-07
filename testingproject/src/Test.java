
 class Test2 {
	public Test2(int i){
		  System.out.println("neeraj");
	  }
		
			int test(){
				System.out.println("testing");
				return 1;
			}

	/**
	 * @param args
	 */
	

}
public class Test extends Test2 {
	
	public Test(int i) {
		
		super(i);
	
		// TODO Auto-generated constructor stub
	}
	{
		
	}
	public static void main(String[] args) {
			int a=10;
			int b= 20;
			int c=a+b;
			System.out.println("Pint sun"+c);
			Test2 t=new Test(11);
			System.out.println(t.test());
			// TODO Auto-generated method stub

		}
	

}
	
