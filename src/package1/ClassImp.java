package package1;

public class ClassImp implements Inter1
{
	@Override
	public void method1() {
		System.out.println("method1");
		
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}
	public  void method3()
	{
		System.out.println("method-3");  
	}
public static void main(String[] args) 
{
	
//	Inter1 x=new ClassImp();
//	x.method1();
//	x.method2();
//	
	ClassImp x=new ClassImp();
	x.method3();
	
	
	
	
	
}
	
	
	
}
