import java.util.regex.*;
public class RegularExpression {
	public static void main(String args[]) {
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		System.out.println(b);
	}

}
