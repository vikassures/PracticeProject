package Day1;

class Balance{
	
	private int balance;
	
	Balance(int balance){
		
		this.balance=balance;
		
	}
	public int getBalance()
	{
		return balance;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Balance b=new Balance(1000);
		
		System.out.println(b.getBalance());
		

	}

}
