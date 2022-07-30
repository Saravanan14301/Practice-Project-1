package Project1;
import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		int row1,r2,c1,c2;
		try (Scanner sc = new Scanner(System.in)) {
			row1=sc.nextInt();
			r2=sc.nextInt();
			c1=sc.nextInt();
			c2=sc.nextInt();
			int a[][] = new int[row1][c1];
			int b[][] = new int[r2][c2];
			int c[][] = new int[row1][c2];
			 System.out.println("Enter values for matrix A : \n");
			    for (int i = 0; i < row1; i++) {
			        for (int j = 0; j < c1; j++) 
			            a[i][j] = sc.nextInt();
			    }
			    System.out.println("Enter values for matrix B : \n");
			    for (int i = 0; i < r2; i++) {
			        for (int j = 0; j < c2; j++) 
			            b[i][j] = sc.nextInt();
			    }
			    System.out.println("Matrix multiplication is : \n");
		        for(int i = 0; i < row1; i++) {    
		            for(int j = 0; j < c2; j++){        
		              for(int k = 0; k < c1; k++){      
		                c[i][j] += a[i][k] * b[k][j];      
		              }
		              System.out.print(c[i][j] + " ");  
		            }
		            System.out.println();
		}
	}

}
}
