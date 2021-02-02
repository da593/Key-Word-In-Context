package code;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Alphabetizer - Sorts an array of strings alphabetically using Colletions.sort utility. 
 */

public class Alphabetizer {
	
	public ArrayList<String> alphabetize(ArrayList<String> sentences) {
		Collections.sort(sentences,String.CASE_INSENSITIVE_ORDER);
		return sentences;
	}
}
