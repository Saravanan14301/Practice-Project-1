import java.util.*;
public class string {

	public static void main(String[] args) {
		 String s=new String("Tamilnadu");
		 System.out.println("Length="+(s.length()));
         System.out.println("Substring="+(s.substring(3)));
         String s1="Welcome";
         String s2="welcome";
         System.out.println("Comparison="+(s1.compareTo(s2)));
         System.out.println("To Lowercase="+(s.toLowerCase()));
         System.out.println("Conversion of String to StringBuffer ");
         String s3="Information";
         StringBuffer kd=new StringBuffer(s3);
         kd.reverse();
         System.out.println(kd);
         System.out.println("Conversion of String to StringBuilder");
         StringBuilder ss=new StringBuilder(s3);
         ss.append("Technology");
         System.out.println(ss);
	}

}
