package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * Input - Abstract class that generalizes the types of inputs a user can give to the script
 */

public abstract class Input {
	protected LineStorage lineStorage;
	protected final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	
	public Input() {
		lineStorage = new LineStorage();
	}
	
	//abstract methods
	public abstract ArrayList<String> getInputMedium();
	
	
	
	//removePunctuations and getInput are two methods that both sub-classes use
	public String removePunctuations(String sentence) {
		sentence = sentence.replaceAll("\\p{Punct}", "");
		return sentence;
	   }
	
	
}
