package code;
import java.util.ArrayList;

/*
 * ConsoleOutput - A class that outputs the KWIC results to the console. 
 */

public class ConsoleOutput extends Output {

	public void outputResults(ArrayList<String> results) {
		System.out.println("\nKWIC RESULTS");
		System.out.println("----------------");
		for (String sentence: results) {
			System.out.println(sentence);
		}
	}
}
