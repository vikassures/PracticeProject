package Day1;

public class SmallestInArry {

	public static void main(String[] args) {
		int[] a= {90,10,20,100};
		int smallest= a[0];
		for(int i=0; i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}
System.out.println(smallest);
	}

}
