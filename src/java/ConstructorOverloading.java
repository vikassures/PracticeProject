package Day1;

class Employee{
	
	int id;
	String name;
	String city;
	
	
	Employee(int i, String n)
	{
		id=i;
		name=n;
		System.out.println(i);
	}
	Employee(int i, String n, String c)
	{
		this(i,n);
		city=c;
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Employee e1= new Employee(10,"Vik");

	}

}
