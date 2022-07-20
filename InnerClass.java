class Outer {
	int n;
    public class Inner {
    	public void print() {
    		System.out.println("Inner Class.....");
    	}
    }
    void display_Inner() {
    	Inner inner=new Inner();
    	inner.print();
    }
    }
public class InnerClass {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.display_Inner();
	}

}
