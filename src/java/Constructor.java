package java;


	
	class A {
	
	}
class B{
	
	B()
	{
		System.out.println("Hi");
	}
}
class C{
	C(int i)
	{
		System.out.println("Hello");
	}
}


public class Constructor{

public static void main(String[] args) {
	A a1=new A();
	B b1=new B();
	C c1=new C(10);
}
	
}


