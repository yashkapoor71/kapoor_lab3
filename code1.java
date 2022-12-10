import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input

      {
	    Scanner sc = new Scanner(System.in);
	    int len, i;
	    // take input length
	    len = sc.nextInt();
	    // take input array
	    int arr[] = new int[len];
	    for(i=0; i<len; i++)
	    arr[i] = sc.nextInt();
	    int low=0, high=len-1;
	    boolean flag = true;
	    // check from both ends
	    while(low < high)
	    {
	        // if any symmetric value is different, it is not a palindrome
	        if(arr[low] != arr[high])
	        {
	            flag = false;
	            break;
	        }
	        low++;
	        high--;
	    }
	    // display result
	    if(flag)
	    System.out.println("yes");
	    else
	    System.out.println("no");
      }
   }
}
