import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		int a[]= {5,7,9,3,1,4,8,6};
		int n=5;
		System.out.println("Original Array....");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<n;i++) {
			int k,l;
			l=a[a.length-1];
			for(k=a.length-1;k>0;k--) {
				a[k]=a[k-1];
			}
			a[0]=l;
		}
		System.out.println();
		System.out.println("After right rotation..");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
			
	}
}

	
	
		


