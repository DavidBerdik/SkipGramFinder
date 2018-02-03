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
		
		// Generate the skip grams.
		boolean keepGoing = true;
		for(int x = 0; keepGoing; x++) {
			int gramTracker = x;
			String gramBuilder = "";
			
			for(int y = 0; y < n; y++) {
				// Inner loop is used for tracking how many words we have added to the gram.
				gramBuilder += words[gramTracker] + " ";
				
				if(gramTracker == words.length - 1)
					keepGoing = false;
				else
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