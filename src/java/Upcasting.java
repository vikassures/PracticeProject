package java;

class Father
{
	Void Radio();
	{
		System.out.println("Old radio");
	}
	Void Bike();
	{
		System.out.println("old bike");
	}
}

class Son extends Father
{
	Void Car();
	{
		System.out.println("New Car");
	}
}
public class Upcasting {

	public static void main(String[] args) {
Father f1= new Father();
f1.Bike();

Father f2= new Son();// auto upcasting
f2.Radio();

Son s2=(Son)f2;// explicit downcasting
s2.Car();





}
}