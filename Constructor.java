
public class Constructor {
	 int m=9;
	Constructor() {
		int s=m*m;
		System.out.println("Result="+s);
	}
	Constructor(String a) {
		System.out.println("Name="+a);
		
	}

	public static void main(String[] args) {
		 Constructor tr=new Constructor();
		 Constructor tu=new Constructor("Ram");

	}

}
