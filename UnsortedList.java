package Project1;
import java.util.Arrays;
public class UnsortedList { 
	public static int kthSmallest(Integer[] arr,int k) 
		{
	        Arrays.sort(arr);
	        return arr[k - 1];
	    }
	  
	public static void main(String[] args) {
		        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		        int k = 4;
		        System.out.print("4'th smallest element is " + kthSmallest(arr, k));
		    }
		 


	}

