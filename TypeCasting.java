
public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit TypeCasting");
		char a='N';
		System.out.println("value="+a);
		int b=a;
		System.out.println("value="+b);
		float c=b;
		System.out.println("value="+c);
		System.out.println("Explicit TypeCasting");
		int m=75;
		char n=(char)m;
		System.out.println("value="+m);
		System.out.println("value="+n);
	}

}
