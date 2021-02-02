package code;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * CircularShift - A class that shifts elements of an array by 1 to the left.
 */

public class CircularShift {
	private LineStorage lineStorage = new LineStorage();

	
	public ArrayList<String> circularShift(ArrayList<String> sentences) {
		//Loops through each sentence
		for (String sentence : sentences) {
			String[] list = sentence.split(" ");
			//Loops each word in each sentence to get all permutations
			for (int i=0;i < list.length; i++) {
				String temp = list[0];
				for (int j=1; j<list.length;j++) {
					list[j-1] = list[j];
				}
				list[list.length-1] = temp;
				ArrayList<String> a = new ArrayList<>(Arrays.asList(list));
				String shiftedSentence = String.join(" ", a);
				lineStorage.addLine(shiftedSentence);
			}
			
		}
		return lineStorage.getSentences();
	}

}
