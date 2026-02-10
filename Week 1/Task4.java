import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = input.nextInt();
		
		if (n <= 0) {
		    System.out.println("Array must contain at least one element.");
		    input.close();
		    return;
		}
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		int max = a[0];
		for(int i = 1; i < n; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("The largest number is : "+max);
		input.close();

	}

}