import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = input.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the array elements: ");
		
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		
		System.out.println("Enter the index to be printed: ");
		int target = input.nextInt();
		
		if (target >= n || target < 0) {
		    System.out.println("Index Out of Bounds.");
		} else {
		    System.out.println(a[target]); 
		}
		
		input.close();

	}

}