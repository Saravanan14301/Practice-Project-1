
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		char operator;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Arithmetic Calculator....");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the operator... +,-,*,/ ");
		operator=sc.next().charAt(0);
		switch(operator) {
		case '+':result=a+b;
		System.out.println("The sum of two numbers..."+result);
		break;
		case '-':result=a-b;
		System.out.println("The subtracion of two numbers..."+result);
		break;
		case '*':result=a*b;
		System.out.println("The product of two numbers..."+result);
		break;
		case '/':result=a/b;
		System.out.println("The division of two numbers..."+result);
		break;
		default:System.out.println("Enter valid operations.....");
		break;
		}	
	}
}
