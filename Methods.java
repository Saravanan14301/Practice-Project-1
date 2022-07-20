import java.io.*;
public class Methods {
	static void change(int n) {
		n=n+100;
	}
	public void add(int x,int y) {
		int z=x+y;
		System.out.println("sum="+z);
	}
	public static void main(String[] args) {
		int n=30;
		System.out.println("Before change n="+n);
		change(n);
		System.out.println("After change n="+n);
        Methods am=new Methods();
        am.add(9, 4);
	}

}
