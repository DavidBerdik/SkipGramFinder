import java.util.Scanner;

public class SGFind {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k;
		int n;
		String sentence;
		
		// Collect user input.
		System.out.print("Enter skip value (k): ");
		k = scanner.nextInt();
		
		System.out.print("Enter gram value (n): ");
		n = scanner.nextInt();
		
		System.out.print("Enter sentence: ");
		scanner.nextLine();
		sentence = scanner.nextLine();
	}
}

// https://en.wikipedia.org/wiki/N-gram#Skip-gram