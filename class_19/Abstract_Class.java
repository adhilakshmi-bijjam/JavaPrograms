package class_19;

abstract class class1{
	abstract void method1(); //abstract method
	
	abstract void method2();	//abstract method
	void method3() {  //concrete method
		
		System.out.println("Hi");
	}
	
	
}
abstract class class2 extends class1
{
	abstract void method4(); //abstract method
	abstract void method5(); //abstract method
	
}
public class Abstract_Class extends class2 {

	public static void main(String[] args) {
		
		
		
		

	}

	@Override
	void method4() {
		
		
	}

	@Override
	void method5() {
		
		
	}

	@Override
	void method1() {
		
		
	}

	@Override
	void method2() {
		
		
	}

}
