package java;

class New
{
	
	public static void M1()
	{
		System.out.println("Hi");
	}
	
	public void M2()
	{
		System.out.println("Hello");
	}
	
}
public class StaticNonStatic {

	public static void main(String[] args) {
New b1=new New();
New.M1();
 
New b2=new New();
b2.M2();


	

	}

}
