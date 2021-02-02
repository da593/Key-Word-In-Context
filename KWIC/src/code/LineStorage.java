package code;
import java.util.ArrayList;

/*
 * LineStorage - A class that takes a string and stores it in an array. 
 */

public class LineStorage {
	private ArrayList<String> sentences = new ArrayList<String>();
	
	//Add a string (sentence) to the array
	public void addLine(String line) {
		this.sentences.add(line);
	}
	
	//Retrieves a sentence given a position. The position is based on the array index
	public String getLine(int position) {
		if (position < 0 || position > this.sentences.size()) {
			return "Invalid index";
		}
		else {
			return this.sentences.get(position);
		}
	}
	
	
	public void setSentences(ArrayList<String> sentences) {
		this.sentences = sentences;
	}
	
	public ArrayList<String> getSentences() {
		return this.sentences;
	}
	
	//These are ignored since the scope of the problem does not include manipulating words or is not needed to solve the problem
	public void addWord() {}
	public void getWord() {
	}

}
