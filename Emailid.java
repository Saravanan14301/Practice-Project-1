
import java.util.Scanner;
public class Emailid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]= {"ram1@gmail.com","fahad@gmail.com","sam5691@gmail.com","kanisk@gmailcom"};
		System.out.println("Enter the emailId....");
		String user=sc.nextLine();
		for (String element:arr) {
			if(element.contains(user)) {
				System.out.println(element);
			}
			else {
				System.out.println("The mailId you have entered is not found in the given array...");
				break;
		}	
	}
}
}