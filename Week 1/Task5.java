import java.util.Scanner;
import java.util.Arrays;
public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = input.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Enter the K value: ");
		int k = input.nextInt();
		
		Arrays.sort(a);
		if(k >= 1 && k <= n) {
			System.out.println("The Kth smallest element is: "+a[k-1]);
		} else {
			System.out.println("Out of Bounds");
		}
		
		input.close();

	}

}