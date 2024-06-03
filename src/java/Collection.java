package Day1;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {

	List<String> a =new ArrayList<String>();
a.add("red apple");
a.add("Banana");
System.out.println(a);
a.set(0, "red apple");
System.out.println(a);
a.remove("red apple");
System.out.println(a);
System.out.println(a.size());
System.out.println(a.indexOf("Apple"));



	}

}
