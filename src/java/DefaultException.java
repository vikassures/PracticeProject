package Day1;

public class DefaultException {

	public static void main(String[] args) {
		System.out.println("Main starts");
		int i=10;
		int j=0;
		try {
			int res=i/j;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
			
		}
		
		System.out.println("Main ends");

	}

}
