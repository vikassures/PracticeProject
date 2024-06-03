package Day1;

interface Vik{
	
	void m1();
	
	public abstract void M2();
	
}

class Viv implements Vik{
	public void m1()
	{
		System.out.println("Hello");
	}
}

public class Interface {

	public static void main(String[] args) {
Viv a1=new Viv();
a1.m1();

	}

}
