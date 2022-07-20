import java.util.Scanner;
class Product {
	protected void mul(int g,int h) {
		System.out.println(g*h);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	void div(int a,int b) {
		System.out.println(a%b);
	}
}
public class AccessSpecifier {
	public int a=10;
	public int b=20;
	public static int age;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i1=sc.nextInt();
		int  i2=sc.nextInt();
		add(i1,i2);

	     Product obj=new Product();
	     obj.mul(i1,i2);
	     obj.sub(i1,i2);
	     obj.div(i1, i2);
	      
	}
	private static void add(int i1, int i2) {
		System.out.println(i1+i2);
		
	}
	

}

