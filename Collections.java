import java.util.*;
public class Collections {

	public static void main(String[] args) {
		System.out.println("Creating ArrayList... ");
		 ArrayList<String> name=new ArrayList<String>();
		 name.add("fahad");
		 name.add("nehra");
		 name.add("kiran");
		 System.out.println("Names are..."+name);
		 System.out.println("Creating LinkedList...");
		 LinkedList<String> companies=new LinkedList<String>();
		 companies.add("CTS");
		 companies.add("WIPRO");
		 companies.add("FIS");
		 System.out.println("Companies are..."+companies);
		 System.out.println("Creating Hashset...");
		 HashSet<Integer> value=new HashSet<Integer>();
		 value.add(1);
		 value.add(2);
		 value.add(3);
		 System.out.println("Values are..."+value);
	}

}
