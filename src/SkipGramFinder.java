import java.util.Scanner;
import java.util.ArrayList;

public class SkipGramFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k;
		int n;
		String sentence;
		ArrayList<String> skipGrams = new ArrayList<>();
		
		// Collect user input.
		System.out.print("Enter skip value: ");
		k = scanner.nextInt();
		
		System.out.print("Enter gram value: ");
		n = scanner.nextInt();
		
		System.out.print("Enter sentence  : ");
		scanner.nextLine();
		sentence = scanner.nextLine();
		scanner.close();
		
		// Split each word into its own element in an array based on spaces.
		String[] words = sentence.split(" ");
		
		// Iterate through the array of words until we reach a point where attempting to
		// complete a skip gram would result in an ArrayIndexOutOfBoundsException.
		for(int x = 0; x + (k + 1) * (n - 1) < words.length; x++) {
			int gramTracker = x;
			String gramBuilder = "";
			
			for(int y = 0; y < n; y++) {
				// The inner loop is used for adding words to each gram as well as for keeping
				// track of how many have been added.
				gramBuilder += words[gramTracker] + " ";
				gramTracker += k + 1;
			}
			
			skipGrams.add(gramBuilder);
		}
		
		// Print the skip grams.
		System.out.println("\n" + k + "-skip-" + n + "-grams are:");
		for(int x = 0; x < skipGrams.size(); x++)
			System.out.println(skipGrams.get(x));
	}
}