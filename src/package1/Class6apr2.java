package package1;

public class Class6apr2 extends Class6apr1
{
public void method()
{
	System.out.println("child class method-3");
}
public void method4()
{
	System.out.println("child class method-4");
}
	public static void main(String[] args) {
//		Class6apr2 x=new Class6apr2();//inheritance
//		x.method1();
//		x.method2();
//		x.method3();
//		x.method4();
//		
		
		//upcasting
		Class6apr1 y=new Class6apr2();
		y.method();
		y.method2();
		

	}

}
