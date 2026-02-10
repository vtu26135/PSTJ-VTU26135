import java.util.Scanner;
import java.util.Arrays;
public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = input.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println("Enter the target value: ");
		int target = input.nextInt();

		int low = 0;
		int high = n - 1;
		int resultIndex = -1;
		while(low <= high) {
			int mid = low + (high + low) / 2; 
			if(a[mid] == target) {
				resultIndex = mid;
			} else if (target < a[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
		input.close();

	}

}